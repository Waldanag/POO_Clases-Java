package Ejercitacion;

public class Pelota extends Producto{
    private double radio;

    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }
    @Override
    public double calcularEspacio() {
        return (4/3) * 3.1416 * ( radio*radio*radio );
    }

}
