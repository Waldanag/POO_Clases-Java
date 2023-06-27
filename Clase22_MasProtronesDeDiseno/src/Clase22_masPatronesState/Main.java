package Clase22_masPatronesState;

public class Main {
    public static void main(String[] args) {

        Reparacion rep1 = new Reparacion("Batidora");

        try {
            rep1.darValorPresupuesto(15000);
            rep1.pasarSiguienteEstado();
            rep1.getEstado();


        } catch (ExceptionReparacion exceptionReparacion){
            System.out.println(exceptionReparacion.getMessage());

        }


    }
}