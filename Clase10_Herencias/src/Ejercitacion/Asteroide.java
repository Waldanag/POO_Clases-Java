package Ejercitacion;

import java.util.Objects;

public class Asteroide extends ObjetoGrafico{

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    public void irA(int x, int y, char direccion){

    }

    @Override
    public String toString() {
        return "Asteroide{" + super.toString() +
                "lesion=" + lesion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lesion);
    }
}
