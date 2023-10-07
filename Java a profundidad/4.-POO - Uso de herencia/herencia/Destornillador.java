package herencia;

public class Destornillador extends Herramienta {
    public static void main(String[] args) {
        Destornillador d = new Destornillador();
        d.material="Aluminio";
        d.nombre="Destornillador cruz";

        d.soyUn();
        d.estoyHecho();
    }
}
