package Mascota;

public class PruebaMascotas {
    public static void main(String[] args) {
        Mascota[] mascotas= new Mascota[3];

        mascotas[0] = new Perro("Fido");
        mascotas[1] = new Gato("Misifus");
        mascotas[2] = new Perro("Princesa");

        for (Mascota mascota : mascotas) {
            System.out.println(mascota.getNombre());

            if(mascota instanceof Perro){
                ((Perro) mascota).ladrar();
            }else if (mascota instanceof Gato) {
                ((Gato) mascota).maullar();
            }
            System.out.println();
        }
    }
}
