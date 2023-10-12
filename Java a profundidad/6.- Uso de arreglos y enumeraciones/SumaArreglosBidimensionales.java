public class SumaArreglosBidimensionales {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        
        int[][] arreglo1 = new int[filas][columnas];
        int[][] arreglo2 = new int[filas][columnas];

        llenarArreglo(arreglo1);
        llenarArreglo(arreglo2);

        int[][] sumaArreglo = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaArreglo[i][j] = arreglo1[i][j] + arreglo2[i][j];
            }
        }

        System.out.println("Arreglo 1:");
        imprimirArreglo(arreglo1);

        System.out.println("Arreglo 2:");
        imprimirArreglo(arreglo2);

        System.out.println("Suma de arreglos:");
        imprimirArreglo(sumaArreglo);
    }

    // Función para llenar un arreglo bidimensional con valores aleatorios
    private static void llenarArreglo(int[][] arreglo) {
        int filas = arreglo.length;
        int columnas = arreglo[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                arreglo[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
            }
        }
    }

    // Función para imprimir un arreglo bidimensional
    private static void imprimirArreglo(int[][] arreglo) {
        int filas = arreglo.length;
        int columnas = arreglo[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(arreglo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

