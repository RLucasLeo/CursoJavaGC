/*Ejercicio 1
 * Realiza un programa que imprimas las tablas de multiplicar del 1 al 20,
 * debe existir un espacio entre una y otra para identificarlas.
 * 
 * Ejercicio2
 * Modifica el programa anterior para que solo se impriman las tablas de 
 * multiplicar de numeros pares, para identificar si los numeros son pares puedes
 * utilizar el operador modulo 2 como se muestra a continuacion: 
 * int x=2;
 */

class Ejercicio2_1{
    public static void main(String[] args) {
        for(int i = 1; i<=20;i++){
            System.out.println("Tabla del "+i);
            for(int j=1; j<=10; j++){            
            System.out.println(i * j);}
        }
    }
}