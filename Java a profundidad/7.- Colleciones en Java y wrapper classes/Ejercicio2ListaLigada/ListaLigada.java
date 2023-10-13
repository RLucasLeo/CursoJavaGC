package Ejercicio2ListaLigada;

public class ListaLigada<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        E data;
        Node<E> previous;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.previous = null;
            this.next = null;
        }
}
public void LinkedList() {
    first = null;
    last = null;
    size = 0;
}

public void add(E element) {
    Node<E> newNode = new Node<>(element);
    
    if (size == 0) {
        first = newNode;
        last = newNode;
    } else {
        newNode.previous = last;
        last.next = newNode;
        last = newNode;
    }
    
    size++;
}

public boolean remove(E element) {
    Node<E> current = first;
    
    while (current != null) {
        if (current.data.equals(element)) {
            Node<E> previousNode = current.previous;
            Node<E> nextNode = current.next;

            if (previousNode != null) {
                previousNode.next = nextNode;
            } else {
                first = nextNode;
            }

            if (nextNode != null) {
                nextNode.previous = previousNode;
            } else {
                last = previousNode;
            }

            size--;
            return true; // Element removed
        }
        
        current = current.next;
    }
    
    return false; // Element not found
}

public boolean contains(E element) {
    Node<E> current = first;
    
    while (current != null) {
        if (current.data.equals(element)) {
            return true; // Element found
        }
        
        current = current.next;
    }
    
    return false; // Element not found
}

public int size() {
    return size;
}

public void printList() {
    Node<E> current = first;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
}
