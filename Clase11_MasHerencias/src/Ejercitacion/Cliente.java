package Ejercitacion;

public class Cliente {
    private int numeroCliente;
    private String apellido;
    private String DNI;
    private String CUIT;

    public Cliente(int numeroCliente, String apellido, String DNI, String CUIT) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }
}
