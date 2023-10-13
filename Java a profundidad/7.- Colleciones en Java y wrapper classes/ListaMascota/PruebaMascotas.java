package ListaMascota;

import java.util.ArrayList;
import java.util.List;

public class PruebaMascotas {
    public static void main(String[] args) {
       List<Mascota> mascotas = new ArrayList();

       mascotas.add(new Perro("Fido"));
       mascotas.add(new Gato("Misifus"));
       mascotas.add(new Perro("Princesa"));

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
