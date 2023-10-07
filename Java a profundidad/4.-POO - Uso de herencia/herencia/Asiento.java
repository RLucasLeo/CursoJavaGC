package herencia;

public class Asiento extends Mueble {
    public static void main(String[] args) {
        Asiento a= new Asiento();
        a.material="Madera";
        a.nombre="Silla";

        a.soyUn();
        a.estoyHecho();
    }
}
