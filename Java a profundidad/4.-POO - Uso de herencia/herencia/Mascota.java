package herencia;

public class Mascota extends Animal {
    public static void main(String[] args) {
        Mascota m=new Mascota();
        m.nombre="Princesa";
        m.edad=1;
        m.raza="Salchicha";
        m.sexo="Macho";
        m.miNombre();
        m.miEdad();
        m.miRaza();
        m.miSexo();
    }
}
