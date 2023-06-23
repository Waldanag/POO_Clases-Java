package Clase20_PatronState;

public class Tamagochi {
    private Estado estado;

    public Tamagochi(){
        estado = new Hambre(this);
    }

    public void comer()
    {
        estado.comer();
    }

    public void beber()
    {
        estado.beber();
    }

    public void mimos()
    {
        estado.mimos();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
