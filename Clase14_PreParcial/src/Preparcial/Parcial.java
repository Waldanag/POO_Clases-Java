package Preparcial;

public class Parcial extends Examen{

    private int numeroUnidad;
    private int numeroReintentos;

    public Parcial(String titulo, String enunciado, Alumno alumno, int numeroUnidad) {
        super(titulo, enunciado, alumno);
        this.numeroUnidad = numeroUnidad;
    }

    public boolean puedeRecuperar()
    {
        if (numeroUnidad>=1 && numeroUnidad<=3) {
            if (numeroReintentos < 3)
                return true;
        }
        if (numeroUnidad>3){
            if (numeroReintentos<2)
                return true;
        }
        return false;
    }
    @Override
    public boolean estaAprobado() {
        return getNota()>=4;
    }
}
