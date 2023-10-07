package herencia;

public class Animal {
    String nombre;
    String raza;
    int edad;
    String sexo;

    void miNombre(){
        System.out.println("Soy un animal y mi nombre es "+nombre);
    }

    void miRaza(){
        System.out.println("Soy de la raza "+raza);
    }

    void miEdad(){
        System.out.println("Tengo "+edad+" año/s");
    }

    void miSexo(){
        System.out.println("Soy un/a "+sexo);
    }
}
