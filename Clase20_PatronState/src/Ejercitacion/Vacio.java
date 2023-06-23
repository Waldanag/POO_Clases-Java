package Ejercitacion;

public class Vacio implements Estado{
    private Carrito c;

    public Vacio(Carrito c) {
        System.out.println("Estoy vacio");
        this.c = c;
    }
    @Override
    public void agregarProducto(Producto producto) {
        c.getProductos().add(producto);
        c.setEstado(new Cargando(c));
    }
    @Override
    public void cancelarCarrito() {
        System.out.println("Accion invalida");
    }
    @Override
    public void volverPunto() {
        System.out.println("Accion invalida");
    }
    @Override
    public void siguienteEstado() {
        c.setEstado(new Cargando(c));
    }
}
