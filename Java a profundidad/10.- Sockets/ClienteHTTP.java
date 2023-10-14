import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import ejercicio3.HTTPRequest;
import ejercicio3.HTTPResponse;

public class ClienteHTTP {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 8069;

        try (Socket socket = new Socket(host, puerto);
             ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream())) {

            Map<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "text/plain");

            HTTPRequest request = new HTTPRequest("Cuerpo de la solicitud", headers);
            outToServer.writeObject(request);

            HTTPResponse response = (HTTPResponse) inFromServer.readObject();
            System.out.println("Respuesta del servidor:");
            System.out.println("Body: " + response.getBody());
            System.out.println("Headers: " + response.getHeaders());
            System.out.println("HTTP Status: " + response.getHttpStatus());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

