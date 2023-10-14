import java.io.IOException;

public class CopiarArchivo {

    public static void main(String[] args) {
        try {

            String archivoOrigen = "C:\\Users\\lucas\\OneDrive\\Escritorio\\Lucas\\Curso_Java\\Java a profundidad\\9.-Manejo de archivos y flujos\\Archivo origen";


            String archivoDestino = "C:\\Users\\lucas\\OneDrive\\Escritorio\\Lucas\\Curso_Java\\Java a profundidad\\9.-Manejo de archivos y flujos\\Archivo destino";
            // cp en unix/linux
            //  'copy' en windows
            String sistemaOperativo = System.getProperty("os.name").toLowerCase();
            ProcessBuilder builder;
            if (sistemaOperativo.contains("win")) {
                builder = new ProcessBuilder("cmd.exe", "/c", "copy", archivoOrigen, archivoDestino);
            } else {
                builder = new ProcessBuilder("cp", archivoOrigen, archivoDestino);
            }

            Process process = builder.start();

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Archivo copiado");
            } else {
                System.out.println("Error al copiar el archivo");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
