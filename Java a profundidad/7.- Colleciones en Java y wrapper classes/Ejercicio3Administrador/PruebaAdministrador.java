package Ejercicio3Administrador;

public class PruebaAdministrador {
    public static void main(String[] args) {
        AdministradorLista<Integer> administrador = new AdministradorLista<>();
        
        administrador.agregarElemento(1);
        administrador.agregarElemento(2);
        administrador.agregarElemento(3);
        administrador.agregarElemento(2); // No se agregará porque es un duplicado
        
        System.out.println("Tamaño de la lista: " + administrador.obtenerTamanio());
        System.out.println("¿Contiene 2? " + administrador.buscarElemento(2));
        
        administrador.imprimirLista();
        
        administrador.borrarElemento(2);
        administrador.imprimirLista();
    }
}
