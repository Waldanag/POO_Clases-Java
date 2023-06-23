package Clase20_PatronState;

public class Feliz implements Estado{
    private Tamagochi t;

    public Feliz(Tamagochi t) {
        System.out.println("Estoy Feliz");
        this.t = t;
    }

    @Override
    public void comer() {
        t.setEstado(new Sed(t));
    }

    @Override
    public void beber() {
        t.setEstado(new Hambre(t));
    }

    @Override
    public void mimos() {
        System.out.println("Sin cambios");
    }
}
