import java.util.Scanner;

public class Ejercicio2 {
        public static void main (String[] args){
        Scanner $ = new Scanner(System.in);
        int x;
        
        do{
            System.out.println("Calcular area de");
            System.out.println("1.-Cuadrado");
            System.out.println("2.-Circulo");
            System.out.println("3.-Rectangulo");
            System.out.println("4.-Triangulo");
            System.out.println("5.-Salir");
            System.out.print("Seleccione una opcion: ");
            x=$.nextInt();

            switch(x){
                case 1:
                    a();
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    c();
                    break;
                case 4:
                    d();
                    break;
                case 5:
                    System.out.println("Programa terminado");
                default:
                    System.out.println("Ingrese una opcon valida");
            }
        } while (x!=5);
            $.close();
    }
    public static void a(){
        Scanner $ = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        int lado = $.nextInt();
        double _a = lado * lado;
        System.out.println("El área del cuadrado es "+_a);
    }

    public static void b(){
        Scanner $ = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double $_b = $.nextDouble();
        double _a = Math.PI * Math.pow($_b, 2);
        System.out.println("El área del circulo es "+_a);
    }

     public static void c() {
        Scanner $ = new Scanner(System.in);
        System.out.print("Ingrese la longitud del rectángulo: ");
        double _op23 = $.nextDouble();
        System.out.print("Ingrese la anchura del rectángulo: ");
        double anchura = $.nextDouble();
        double _a = _op23 * anchura;
        System.out.println("El área del rectángulo es: " + _a);
    }

    public static void d() {
        Scanner $ = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double r = $.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double $e_ = $.nextDouble();
        double _a = (r * $e_) / 2;
        System.out.println("El área del triángulo es: " + _a);
    }
}
