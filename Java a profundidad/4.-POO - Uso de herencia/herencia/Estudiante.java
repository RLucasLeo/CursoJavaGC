package herencia;

public class Estudiante extends Persona{
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Lucas";
        e.edad=22;
        e.altura=183;
        e.dormir();
        e.despertar();
        e.comer();
    }
}
