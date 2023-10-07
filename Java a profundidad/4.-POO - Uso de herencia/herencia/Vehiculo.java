package herencia;

public class Vehiculo {
    String vehiculo;
    String modelo;
    int fabricacion;

    Vehiculo(String v, String m, int f){
        this.vehiculo=v;
        this.modelo=m;
        this.fabricacion=f;
    }

    void soyUn(){
        System.out.println("Soy un/a "+vehiculo);
    }

    void modelo(){
        System.out.println("Soy el modelo "+modelo);
    }

    void anioCreacion(){
        System.out.println("Me fabricaron el "+fabricacion);
    }
}
