package Mascota;

public class Gato extends Mascota{
    
    public Gato(String nombre) {
        super(nombre);
    }

    public void maullar() {
        System.out.println(getNombre() + " está maullando");
    }
}
