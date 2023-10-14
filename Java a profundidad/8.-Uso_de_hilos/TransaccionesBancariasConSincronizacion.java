class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public synchronized boolean retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido.");
            return false;
        }

        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de " + monto + " - Saldo restante: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}

public class TransaccionesBancariasConSincronizacion {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        Runnable retirada = () -> {
            for (int i = 0; i < 5; i++) {
                cuenta.retirar(200);
            }
        };

        Thread hilo1 = new Thread(retirada);
        Thread hilo2 = new Thread(retirada);

        hilo1.start();
        hilo2.start();
    }
}
