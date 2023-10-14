import java.io.*;
import java.net.Socket;

public class ClienteEnviarArchivo {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 8069;

        try (Socket socket = new Socket(host, puerto);
             OutputStream outToServer = socket.getOutputStream();
             FileInputStream fileInputStream = new FileInputStream("archivo_a_enviar.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outToServer.write(buffer, 0, bytesRead);
            }

            System.out.println("Cliente: Archivo enviado al servidor.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}