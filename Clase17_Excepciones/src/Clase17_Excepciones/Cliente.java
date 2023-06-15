package Clase17_Excepciones;

public class Cliente {

    private String nombre;
    private String apellido;
    private String DNI;
    private double saldoEnDeuda;
    private double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite = limite;
        saldoEnDeuda = 0;
    }

    public void comprar(double importe) throws ClienteExcepcion {
        if (saldoEnDeuda+importe>limite)
            throw new ClienteExcepcion("No hay mas limite disponible");
        else
            saldoEnDeuda += importe;
    }

    public void saldarDeuda(double importe) throws ClienteExcepcion {
        if (saldoEnDeuda == 0)
            throw new ClienteExcepcion("No hay deuda");
        else
            saldoEnDeuda -= importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", saldoEnDeuda=" + saldoEnDeuda +
                ", limite=" + limite +
                '}';
    }
}
