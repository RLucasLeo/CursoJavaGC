package Ejercicio3Administrador;
import java.util.HashSet;

public class AdministradorLista<E> {
    private HashSet<E> lista;

    public AdministradorLista() {
       lista = new HashSet<>();
    }

    public void agregarElemento(E elemento) {
        lista.add(elemento);
    }

    public boolean borrarElemento(E elemento) {
        return lista.remove(elemento);
    }

    public boolean buscarElemento(E elemento) {
        return lista.contains(elemento);
    }

    public int obtenerTamanio() {
        return lista.size();
    }

    public void imprimirLista() {
        for (E elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
