package Preparcial;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    protected double nota;
    private Alumno alumno;

    public Examen(String titulo, String enunciado, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.alumno = alumno;
        nota=0;
    }

    public abstract boolean estaAprobado();

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
