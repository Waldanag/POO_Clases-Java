package Clase20_PatronState;

public class Hambre implements Estado{
    private Tamagochi t;

    public Hambre(Tamagochi t) {
        System.out.println("Tengo hambre");
        this.t = t;
    }

    @Override
    public void comer() {
        t.setEstado(new Feliz(t));
    }

    @Override
    public void beber() {
        t.setEstado(new Triste(t));
    }

    @Override
    public void mimos() {
        System.out.println("Sin cambios");
    }
}
