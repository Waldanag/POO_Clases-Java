package ejercitacion;

import java.time.LocalDate;
public class Perros {

    //ATRIBUTOS
    private boolean enAdopcion;
    private String raza;
    private int anioAproxNacimiento;
    private Double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;

    //CONSTRUCTORES
    public Perros(boolean enAdopcion, String raza, int anioAproxNacimiento, Double peso, boolean tieneChip, boolean estaLastimado, String nombre) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioAproxNacimiento = anioAproxNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public Perros() {
    }

    //METODOS
    public boolean puedePerderse(){
        return !this.tieneChip;
    }
    public boolean puedeAdoptarse(){
         return !this.estaLastimado && this.peso > 5.45;
    }


    //GETTERS Y SETTERS
    public boolean isEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioAproxNacimiento() {
        return anioAproxNacimiento;
    }

    public void setAnioAproxNacimiento(int anioAproxNacimiento) {
        this.anioAproxNacimiento = anioAproxNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "enAdopcion=" + enAdopcion +
                ", raza='" + raza + '\'' +
                ", anioAproxNacimiento=" + anioAproxNacimiento +
                ", peso=" + peso +
                ", tieneChip=" + tieneChip +
                ", lastimado=" + estaLastimado +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}
