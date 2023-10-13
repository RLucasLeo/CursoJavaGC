package Ejercicio2ListaLigada;

public class PruebaListaLigada {
    public static void main(String[] args) {
        ListaLigada<Integer> linkedList = new ListaLigada<>();
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        
        linkedList.printList();

        linkedList.remove(2);
        
        linkedList.printList();
        
        System.out.println("Tamanio: " + linkedList.size());
        
        System.out.println("Contiene 3?: " + linkedList.contains(3));
        System.out.println("Contiene 2?: " + linkedList.contains(2));
    }
}
