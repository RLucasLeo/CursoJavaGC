/* Ejercicio2
 * Modifica el programa para que solo se impriman las tablas de 
 * multiplicar de numeros pares, para identificar si los numeros son pares puedes
 * utilizar el operador modulo 2 como se muestra a continuacion: 
 * int x=2;
 */
public class Ejercicio2_2 {
    
    public static void main(String[] args) {
        int x=2;
        for(int i = 1; i<=20;i++){
            if(i%x==0){
               System.out.println("Tabla del "+i);
            for(int j=1; j<=10; j++){            
            System.out.println(i * j);} 
            }
            
        }
    }
}
