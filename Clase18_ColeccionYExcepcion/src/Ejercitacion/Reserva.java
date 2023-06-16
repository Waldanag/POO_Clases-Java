package Ejercitacion;

public class Reserva {
    private String codigo;
    private Recorrido recorrido;
    private Integer cantidadPersonas;
    private double precioBoleto;

    public Reserva(String codigo, Recorrido recorrido, Integer cantidadPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantidadPersonas = cantidadPersonas;
        precioBoleto = 50;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public double calcularValorReserva(Integer cantidadPersonas, double precioBoleto){
        return cantidadPersonas * precioBoleto;
    }

}
