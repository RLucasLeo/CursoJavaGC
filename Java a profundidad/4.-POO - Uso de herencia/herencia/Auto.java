package herencia;

public class Auto extends Vehiculo {
    Auto(String v, String m, int f){
        super(v, m, f);
    }

    @Override
    void soyUn(){
       System.out.printf("Impreso desde super: "); super.soyUn();
        System.out.println("Soy un "+vehiculo+" impreso desde el Override");
    }
}
