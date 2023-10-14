package hiloFumadores;

class Mesa {
    private boolean papel = false;
    private boolean tabaco = false;
    private boolean cerillos = false;

    public synchronized void colocarMaterial(String material) {
        if (material.equals("papel")) {
            papel = true;
        } else if (material.equals("tabaco")) {
            tabaco = true;
        } else if (material.equals("cerillos")) {
            cerillos = true;
        }
        System.out.println("Colocado " + material);
        notifyAll(); // Notifica a los fumadores
    }

    public synchronized void esperarMaterial(String fumador, String material1, String material2) {
        while (!tieneMateriales(material1, material2)) {
            try {
                System.out.println(fumador + " esperando materiales.");
                wait(); // Espera hasta que se coloquen los materiales
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(fumador + " tiene los materiales y está fumando.");
        // Después de fumar, reiniciamos la mesa
        papel = false;
        tabaco = false;
        cerillos = false;
        notifyAll();
    }

    private boolean tieneMateriales(String material1, String material2) {
        return (papel && tabaco) || (papel && cerillos) || (tabaco && cerillos);
    }
}
