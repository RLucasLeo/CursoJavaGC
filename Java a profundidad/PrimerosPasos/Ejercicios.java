/* EJERCICIO 1
Realizar un programa capaz de calcular el area de un cuadrado, circulo, rectangulo y triangulo
    
EJERCICIO 2
Toma el ejercicio anterior y combiertelo en un programa ofuscado, un prgrama ofuscado es un programa
del cual no se entuende su funcionalidad a simple vista, haz uso de los conocimientos que tienes de
identificadores para que sea algo dificil de entender
*/
import java.util.Scanner;
public class Ejercicios {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("Calcular area de");
            System.out.println("1.-Cuadrado");
            System.out.println("2.-Circulo");
            System.out.println("3.-Rectangulo");
            System.out.println("4.-Triangulo");
            System.out.println("5.-Salir");
            System.out.print("Seleccione una opcion: ");
            opcion=input.nextInt();

            switch(opcion){
                case 1:
                    CalcularAreaCuadrado();
                    break;
                case 2:
                    CalcularAreaCirculo();
                    break;
                case 3:
                    CalcularAreaRectangulo();
                    break;
                case 4:
                    CalcularAreaTriangulo();
                    break;
                case 5:
                    System.out.println("Programa terminado");
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion!=5);
            input.close();
    }
    public static void CalcularAreaCuadrado(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        int lado = input.nextInt();
        double area = lado * lado;
        System.out.println("El area del cuadrado es "+area);
    }

    public static void CalcularAreaCirculo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = input.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es "+area);
    }

     public static void CalcularAreaRectangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitud = input.nextDouble();
        System.out.print("Ingrese la anchura del rectángulo: ");
        double anchura = input.nextDouble();
        double area = longitud * anchura;
        System.out.println("El área del rectángulo es: " + area);
    }

    public static void CalcularAreaTriangulo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = input.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = input.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}