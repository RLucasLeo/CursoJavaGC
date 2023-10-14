package hiloFumadores;

public class Fumador extends Thread {
    private String nombre;
    private String material1;
    private String material2;
    private Mesa mesa;

    public Fumador(String nombre, String material1, String material2, Mesa mesa) {
        this.nombre = nombre;
        this.material1 = material1;
        this.material2 = material2;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (true) {
            mesa.esperarMaterial(nombre, material1, material2);
            // Fuma
            try {
                Thread.sleep(1000); // Simula fumar
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
