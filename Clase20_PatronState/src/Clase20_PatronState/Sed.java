package Clase20_PatronState;

public class Sed implements Estado{
    private Tamagochi t;

    public Sed(Tamagochi t) {
        System.out.println("Tengo sed");
        this.t = t;
    }

    @Override
    public void comer() {
        t.setEstado(new Triste(t));
    }

    @Override
    public void beber() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void mimos() {
        System.out.println("No cambia");
    }
}
