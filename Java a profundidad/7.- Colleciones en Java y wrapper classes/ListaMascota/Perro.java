package ListaMascota;

public class Perro extends Mascota{
    
    public Perro(String nombre) {
        super(nombre);
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando.");
    }
}
