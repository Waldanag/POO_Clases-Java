package Clase22_Composite;

import java.util.ArrayList;

public class Combo extends Item{
    private double descuento;
    private ArrayList<Item> items;

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        items = new ArrayList<>();
    }

    public void agregarItem(Item item)
    {
        items.add(item);
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Item i:items)
        {
            total += i.calcularPrecio();
        }
        total -= total*descuento/100;
        return total;
    }

    @Override
    public String mostrar() {
        return getNombre() + " " + calcularPrecio();
    }
}
