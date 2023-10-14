import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorRecibirArchivo {

    public static void main(String[] args) {
        int puerto = 8069;

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor: Esperando conexiones en el puerto " + puerto);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     InputStream inFromClient = clientSocket.getInputStream();
                     FileOutputStream fileOutputStream = new FileOutputStream("archivo_recibido.txt")) {

                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = inFromClient.read(buffer)) != -1) {
                        fileOutputStream.write(buffer, 0, bytesRead);
                    }

                    System.out.println("Servidor: Archivo recibido y guardado como 'archivo_recibido.txt'");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}