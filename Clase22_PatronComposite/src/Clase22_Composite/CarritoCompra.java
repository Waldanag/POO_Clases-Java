package Clase22_Composite;

import java.util.ArrayList;

public class CarritoCompra {
    private int numeroPedido;
    private ArrayList<Item> itemCompra;

    public CarritoCompra(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        itemCompra= new ArrayList<>();
    }
    public void comprarItem(Item item)
    {
        itemCompra.add(item);
    }
    public double precioTotal()
    {   double total = 0;
        for (Item i:itemCompra)
        {
            total += i.calcularPrecio();
        }
        return total;
    }
    public String ticket()
    {
        String todos = "";
        for (Item i:itemCompra)
        {
            todos += i.mostrar() + "\n";
        }
        todos += "Total " + precioTotal();
        return todos;
    }

}
