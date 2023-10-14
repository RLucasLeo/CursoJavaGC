package hiloFumadores;

public class Fumadores extends Thread {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        Thread fumador1 = new Thread(new Fumador("Fumador 1", "papel", "tabaco", mesa));
        Thread fumador2 = new Thread(new Fumador("Fumador 2", "tabaco", "cerillos", mesa));
        Thread fumador3 = new Thread(new Fumador("Fumador 3", "cerillos", "papel", mesa));

        Thread productor1 = new Thread(new Productor("papel", mesa));
        Thread productor2 = new Thread(new Productor("tabaco", mesa));
        Thread productor3 = new Thread(new Productor("cerillos", mesa));

        fumador1.start();
        fumador2.start();
        fumador3.start();
        productor1.start();
        productor2.start();
        productor3.start();
    }
}
