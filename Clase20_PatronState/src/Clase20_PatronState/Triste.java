package Clase20_PatronState;

public class Triste implements Estado{
    private Tamagochi t;

    public Triste(Tamagochi t) {
        System.out.println("Estoy Triste");
        this.t = t;
    }

    @Override
    public void comer() {
        System.out.println("Beep Beep, vomitando");
    }

    @Override
    public void beber() {
        System.out.println("Beep Beep Beep, titilando");
    }

    @Override
    public void mimos() {
        t.setEstado(new Feliz(t));
    }
}
