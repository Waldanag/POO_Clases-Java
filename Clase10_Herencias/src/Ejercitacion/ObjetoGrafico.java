package Ejercitacion;

import java.util.Objects;

public class ObjetoGrafico {

    private int posx;
    private int posy;
    private char direccion;

    public ObjetoGrafico(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(int x, int y, char direccion){

    }

    @Override
    public String toString() {
        return "ObjetoGrafico{" +
                "posx=" + posx +
                ", posy=" + posy +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoGrafico that = (ObjetoGrafico) o;
        return posx == that.posx && posy == that.posy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(posx, posy);
    }
}
