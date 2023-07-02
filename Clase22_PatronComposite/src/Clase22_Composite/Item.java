package Clase22_Composite;

public abstract class Item {
    private String nombre;

    public Item(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPrecio();
    public abstract String mostrar();

    public String getNombre() {
        return nombre;
    }
}
