import java.io.IOException;

public class MoverArchivo {

    public static void main(String[] args) {
        try {
            String archivoOrigen = "C:\\Users\\lucas\\OneDrive\\Escritorio\\Lucas\\Curso_Java\\Java a profundidad\\9.-Manejo de archivos y flujos\\Archivo origen";

            String archivoDestino = "C:\\Users\\lucas\\OneDrive\\Escritorio\\Lucas\\Curso_Java\\Java a profundidad\\9.-Manejo de archivos y flujos\\Archivo destino";

            // 'mv' en Unix/Linux
            // 'move' en windows
            String sistemaOperativo = System.getProperty("os.name").toLowerCase();
            ProcessBuilder builder;
            if (sistemaOperativo.contains("win")) {
                builder = new ProcessBuilder("cmd.exe", "/c", "move", archivoOrigen, archivoDestino);
            } else {
                builder = new ProcessBuilder("mv", archivoOrigen, archivoDestino);
            }

            Process process = builder.start();

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Archivo movido");
            } else {
                System.out.println("Error al mover el archivo");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
