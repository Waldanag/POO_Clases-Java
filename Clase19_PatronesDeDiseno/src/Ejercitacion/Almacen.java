package Ejercitacion;

import com.sun.source.tree.ArrayTypeTree;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Producto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){

    }
    public double calcularEspacioNecesario()
    {   double total = 0;
        for (Producto p:productos)
            total += p.calcularEspacio();
        return total;
    }

    }


