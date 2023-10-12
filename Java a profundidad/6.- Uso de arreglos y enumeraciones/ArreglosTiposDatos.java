import java.util.Arrays;
public class ArreglosTiposDatos {
   
    public static void main(String[] args) {
        // Arreglo de boolean
        boolean[] booleanArray = {true, false, true};

        // Arreglo de byte
        byte[] byteArray = {1, 2, 3};

        // Arreglo de short
        short[] shortArray = {10, 20, 30};

        // Arreglo de int
        int[] intArray = {100, 200, 300};

        // Arreglo de char
        char[] charArray = {'A', 'B', 'C'};

        // Arreglo de float
        float[] floatArray = {1.0f, 2.0f, 3.0f};

        // Arreglo de long
        long[] longArray = {1000L, 2000L, 3000L};

        // Arreglo de double
        double[] doubleArray = {1.1, 2.2, 3.3};

        // Puedes imprimir los arreglos para verificar su contenido
        System.out.println("Arreglo de boolean: " + Arrays.toString(booleanArray));
        System.out.println("Arreglo de byte: " + Arrays.toString(byteArray));
        System.out.println("Arreglo de short: " + Arrays.toString(shortArray));
        System.out.println("Arreglo de int: " + Arrays.toString(intArray));
        System.out.println("Arreglo de char: " + Arrays.toString(charArray));
        System.out.println("Arreglo de float: " + Arrays.toString(floatArray));
        System.out.println("Arreglo de long: " + Arrays.toString(longArray));
        System.out.println("Arreglo de double: " + Arrays.toString(doubleArray));
    }
}
