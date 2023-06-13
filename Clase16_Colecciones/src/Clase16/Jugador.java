package Clase16;

public class Jugador implements Comparable<Jugador>{

    private String nombre;
    private int nroCamiseta;
    private boolean lesionado;
    private boolean titular;

    public Jugador(String nombre, int nroCamiseta) {
        this.nombre = nombre;
        this.nroCamiseta = nroCamiseta;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }



    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                ", lesionado=" + lesionado +
                ", titular=" + titular +
                '}';
    }

    @Override
    public int compareTo(Jugador jugador) {
        if (this.nroCamiseta>jugador.nroCamiseta)
            return 1;
        if (this.nroCamiseta<jugador.nroCamiseta)
            return -1;
        return 0;
    }
}
