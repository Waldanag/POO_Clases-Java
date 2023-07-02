package Clase22_Composite;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Producto("Hamburguesa", 2000);
        Item item2 = new Producto("Papas fritas", 800);
        Item item3 = new Producto("Gaseosa", 1000);
        Item item4 = new Producto("Helado", 500);
        Item item5 = new Producto("Flan", 600);

        Item combo1 = new Combo("Combo 1", 10);
        Item combo2 = new Combo("Combo postres", 5);

        ((Combo)combo1).agregarItem(item1);
        ((Combo)combo1).agregarItem(item2);
        ((Combo)combo1).agregarItem(item3);

        ((Combo)combo2).agregarItem(item4);
        ((Combo)combo2).agregarItem(item5);

        ((Combo)combo1).agregarItem(combo2);

        CarritoCompra carrito1 = new CarritoCompra(1111);
        carrito1.comprarItem(combo1);
        carrito1.comprarItem(item1);
        carrito1.comprarItem(item3);
        carrito1.comprarItem(combo2);

        System.out.println(carrito1.ticket());

    }
}