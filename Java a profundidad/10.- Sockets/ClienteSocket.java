import java.io.*;
import java.net.Socket;

public class ClienteSocket {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 8069;

        try (Socket socket = new Socket(host, puerto);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            String mensaje = "apagar"; //Aca va el mensaje a enviar al servidor

            out.println(mensaje);
            System.out.println("Cliente: Enviando mensaje '" + mensaje + "' al servidor.");

            String respuesta = in.readLine();
            System.out.println("Servidor: " + respuesta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
