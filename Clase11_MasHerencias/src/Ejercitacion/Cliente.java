package Ejercitacion;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return numeroCliente == cliente.numeroCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                '}';
    }
}
