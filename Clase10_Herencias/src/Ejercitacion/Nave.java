package Ejercitacion;

import java.util.Objects;

public class Nave extends ObjetoGrafico{

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public void irA(int x, int y, char direccion){

    }

    public void girar(char direccion){

    }

    public void restaVida(int valor){

    }

    @Override
    public String toString() {
        return "Nave{" + super.toString() +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nave nave = (Nave) o;
        return Double.compare(nave.velocidad, velocidad) == 0 && vida == nave.vida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), velocidad, vida);
    }
}
