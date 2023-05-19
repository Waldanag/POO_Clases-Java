import ejercitacion.Perros;

public class Main {
    public static void main(String[] args) {

        Perros perro1 = new Perros( true, "Mestizo", 2017, 6.0, true, false, "Pepito" );

        //IMPRIMIR TODA LA INFO
        System.out.println(perro1);
        System.out.println("------");

        //RESPONDIENDO LAS PREGUNTAS POR SEPARADO
        System.out.println(perro1.getNombre());
        System.out.println(perro1.puedePerderse());
        System.out.println(perro1.puedeAdoptarse());
        System.out.println("------");

        //IMPRIMIR TODAS LAS PREGUNTAS
        System.out.println(" El perro: " + perro1.getNombre() + "\n Es posible que se pierda: " + perro1.puedePerderse() + "\n Es candidato de adoptar: " + perro1.puedeAdoptarse());
        System.out.println("------");





    }
}