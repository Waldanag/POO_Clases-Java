package Clase18;

public class Jugador {

    private String apellido;
    private Integer numeroCamiseta;
    private String posicion;

    public Jugador(String apellido, Integer numeroCamiseta) {
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "apellido='" + apellido + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }
}
