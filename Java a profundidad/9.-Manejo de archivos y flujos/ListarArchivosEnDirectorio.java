import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListarArchivosEnDirectorio {

    public static void main(String[] args) {
        try {
            String directorio = "C:\\Users\\lucas\\OneDrive\\Escritorio\\Lucas\\Curso_Java\\Java a profundidad\\9.-Manejo de archivos y flujos"; // Cambia esto a la ruta deseada

            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "dir", directorio);

            builder.redirectErrorStream(true);
            Process process = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));


            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Proceso finalizado con codigo de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
