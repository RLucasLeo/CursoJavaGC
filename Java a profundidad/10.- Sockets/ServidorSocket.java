import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {

    public static void main(String[] args) {
        int puerto = 8069;
        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor: Esperando conexiones en el puerto " + puerto);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String mensaje = in.readLine();
                    System.out.println("Cliente: Mensaje recibido: '" + mensaje + "'");

                    String respuesta = "";
                    switch (mensaje) {
                        case "iniciar":
                            respuesta = "Iniciando...";
                            break;
                        case "reiniciar":
                            respuesta = "Reiniciando...";
                            break;
                        case "apagar":
                            respuesta = "Apagando...";
                            break;
                        default:
                            respuesta = "Mensaje no reconocido.";
                            break;
                    }

                    out.println(respuesta);
                    System.out.println("Servidor: " + respuesta);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
