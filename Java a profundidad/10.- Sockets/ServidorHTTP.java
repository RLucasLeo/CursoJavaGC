import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import java.util.Map;
import ejercicio3.HTTPRequest;
import ejercicio3.HTTPResponse;

public class ServidorHTTP {

    public static void main(String[] args) {
        int puerto = 8069;

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor: Esperando conexiones en el puerto " + puerto);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     ObjectInputStream inFromClient = new ObjectInputStream(clientSocket.getInputStream());
                     ObjectOutputStream outToClient = new ObjectOutputStream(clientSocket.getOutputStream())) {

                    HTTPRequest request = (HTTPRequest) inFromClient.readObject();
                    System.out.println("Solicitud del cliente recibida:");
                    System.out.println("Body: " + request.getBody());
                    System.out.println("Headers: " + request.getHeaders());

                    // suma
                    int resultado = 5 + 3;

                    Map<String, String> responseHeaders = new HashMap<>();
                    responseHeaders.put("Content-Type", "text/plain");

                    HTTPResponse response = new HTTPResponse("Resultado: " + resultado, responseHeaders, 200);
                    outToClient.writeObject(response);

                    System.out.println("Respuesta enviada al cliente.");

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

