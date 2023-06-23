package Ejercitacion;

import java.util.ArrayList;

public class Carrito {

    private Estado estado;
    private ArrayList<Producto> productos;

    public Carrito(){
        estado = new Vacio(this);
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }
    public void cancelarCarrito()
    {
        estado.cancelarCarrito();
    }
    public void volverPunto()
    {
        estado.volverPunto();
    }
    public void siguienteEstado()
    {
        estado.siguienteEstado();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }


}
