/*
 * Ejercicio1
 * Realizar un diagrama de clases que represente mascotas
 * 
 * Ejercicio2
 * Crea las clases definidas en el ejercicio anterior
 * cada una debera tener mas de un constructor y 
 * el codigo que se utiliza para 
 * inicializar no se deberá repetir
 * 
 * Ejercicio3
 * Hacer debuggin sobre las clases dle ejercicio anterior para que 
 * analices el paso paso de la ejecucion
 */
class Mascota{
   
        String nombre;
        String raza;
        int edad;
        char sexo;
        
        Mascota(){
            System.out.println("Constructor SIN parametros");
        }
        Mascota(String n, String r, int e, char s){
            System.out.println();
            System.out.println("Constructor CON parametros");
            nombre=n;
            raza=r;
            edad=e;
            sexo=s;
    
        }

        void mostrarInfo(){
        System.out.println("La raza de mi mascota es "+raza);
        System.out.println("El nombre de mi mascota es "+nombre);
        System.out.println("La edad de mi mascota es "+edad +" años");
        System.out.println("El sexo de mi mascota es "+sexo);
    }

    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.raza="Pitbull";
        m.nombre="Princesa";
        m.edad=2;
        m.sexo='H';
        m.mostrarInfo();

        Mascota M = new Mascota("Reina","Caniche",22,'H');
        M.mostrarInfo();

        //El debuggin se hizo uilizando una extensión de VSC
    }
}