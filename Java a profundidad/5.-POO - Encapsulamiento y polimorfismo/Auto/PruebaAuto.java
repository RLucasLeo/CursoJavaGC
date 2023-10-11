package Auto;

public class PruebaAuto {
    void imprimirAuto(Auto auto){
        System.out.println("El color del auto es: " +auto.getColor());
        auto.encender();
        auto.getUso();
        auto.getEstado();
        auto.apagar();
    }

    public static void main(String[] args) {
        PruebaAuto p = new PruebaAuto();
        Auto auto = new Auto("Verde", true, 10000);
        p.imprimirAuto(auto);
    }
}
