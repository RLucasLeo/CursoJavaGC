
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            Thread thread = new Thread(new CountdownThread("Hilo " + i));
            thread.setPriority(Thread.MIN_PRIORITY + (i % 3)); // Asigna prioridades diferentes
            thread.start();
        }
    }

    static class CountdownThread implements Runnable {
        private String name;

        public CountdownThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int numero = new Random().nextInt(10) + 1;
            System.out.println(name + " inicio con el numero: " + numero);

            for (int i = numero; i >= 0; i--) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000); // Espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(name + " termino");
        }
    }
}
