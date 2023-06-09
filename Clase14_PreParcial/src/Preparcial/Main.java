package Preparcial;

public class Main {

    public static void main(String[] args) {

    Alumno alumno = new Alumno("Juan", "Perez", 1111);
    Final final1=new Final("Java", "Objetos", alumno, "Programacion");
    Final final2=new Final("Java", "Herencia", alumno, "Programacion");
    final1.setNota(7);
    final1.setNotaOral(8);
    final2.setNota(6);
    final2.setNotaOral(7);
    if (final1.compareTo(final2)>0)
        System.out.println("Final 1 es mayor");

    }
}
