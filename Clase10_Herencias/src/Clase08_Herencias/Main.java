package Clase08_Herencias;

public class Main {
    public static void main(String[] args) {

        Socio socios[] = new Socio[2];

        SocioHabilitado socio = new SocioHabilitado("Juan", "11111", 5000, "pileta", 3000);
        Socio socio1 = new Socio("Maria", "1122", 5000, "spinning");
        Socio socio2 = new SocioHabilitado("Carlos", "1111112", 5000, "pileta", 3000);

        socios[0] = socio1;
        socios[1] = socio2;
        for (int i = 0; i < socios.length; i++)
            System.out.println(socios[i] + " Paga " + socios[i].calcularCostoMensual());

        if (socio2 instanceof SocioHabilitado)
            ((SocioHabilitado) socio2).habilitarSocio();

        //((SocioHabilitado)socio1).habilitarSocio();

        Entrenador entrenador = new Entrenador();
        entrenador.toString();


    }
}