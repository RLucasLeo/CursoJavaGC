package Auto;
/*
 * Ejercicio
 * Crea las clases necerias para representar un automovil,
 * recuerda que debes aplicar los conpectos de 
 * polimorfismo y encapsulamiento
 */
public class Automovil {
    private String color;
    private double kilometros;
    private boolean roto;

    public Automovil(String color){
        this.color = color;
    }
    public void uso(double kilometros){
        
    }

    public void getEstado(boolean roto){
      
    }

    public void encender(){
        System.out.println("Auto encendido");
    }

    public void apagar(){
        System.out.println("Auto apagado");
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}