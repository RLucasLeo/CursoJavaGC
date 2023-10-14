package hiloFumadores;

public class Productor extends Thread {
    private String material;
    private Mesa mesa;

    public Productor(String material, Mesa mesa) {
        this.material = material;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (true) {
            mesa.colocarMaterial(material);
            // Produce material
            try {
                Thread.sleep(1000); // Simula la producción de material
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}