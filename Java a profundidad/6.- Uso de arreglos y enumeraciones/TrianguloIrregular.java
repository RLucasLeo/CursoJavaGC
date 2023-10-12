public class TrianguloIrregular {
    public static void main(String[] args) {
        int n = 5; // Número de filas del triángulo

        // Crear el arreglo en forma de triángulo
        int[][] triangulo = new int[n][];
        for (int i = 0; i < n; i++) {
            triangulo[i] = new int[i + 1];
        }

        // Rellenar el triángulo con valores
        int valor = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangulo[i][j] = valor;
                valor++;
            }
        }

        // Imprimir el triángulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
