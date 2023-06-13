package Ejercitacion;

public class Contenedor implements Comparable<Contenedor>{

    private int numero;
    private String pais;
    private boolean materialesPeligrosos;

    public Contenedor(int numero, String pais, boolean materialesPeligrosos) {
        this.numero = numero;
        this.pais = pais;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    public void setMaterialesPeligrosos(boolean materialesPeligrosos) {
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero=" + numero +
                ", pais='" + pais + '\'' +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}';
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.numero > contenedor.numero)
            return 1;
        if (this.numero < contenedor.numero)
            return -1;
        return 0;
    }
}
