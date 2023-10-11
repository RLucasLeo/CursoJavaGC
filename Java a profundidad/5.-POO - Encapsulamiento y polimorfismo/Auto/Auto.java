package Auto;

public class Auto extends Automovil {

    private boolean roto;
    private double kilometros;

    public Auto (String color, boolean roto, int kilometros){
        super(color);
        this.roto = roto;
        this.kilometros = kilometros;
    }

    public void getEstado() {
        if (roto == false) {
            System.out.println("El auto está en buen estado");
        } else {
            System.out.println("El auto está en mal estado");
        }
    }

    public void getUso(){
        if (kilometros>=10000){
            System.out.println("El auto tiene mucho uso");
        }else if(kilometros<10000){
            System.out.println("El auto tiene poco uso");
        }
    }
}
