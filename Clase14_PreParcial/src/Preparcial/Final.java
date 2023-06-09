package Preparcial;

public class Final extends Examen implements Comparable<Final>{
    private double notaOral;
    private String tema;

    public Final(String titulo, String enunciado, Alumno alumno, String tema) {
        super(titulo, enunciado, alumno);
        this.tema = tema;
    }

    @Override
    public boolean estaAprobado() {
        if (getNota()>=4 && notaOral>=4)
            return true;
        return false;
    }

    public double promedio()
    {
        return (getNota()+notaOral)/2;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    @Override
    public int compareTo(Final aFinal) {
       if (this.promedio()>aFinal.promedio())
           return 1;
       if (this.promedio()<aFinal.promedio())
           return -1;
        return 0;
    }
}
