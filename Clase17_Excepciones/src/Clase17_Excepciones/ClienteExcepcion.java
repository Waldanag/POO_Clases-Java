package Clase17_Excepciones;

public class ClienteExcepcion extends Exception{
    public ClienteExcepcion() {
        super();
    }

    public ClienteExcepcion(String s) {
        super(s);
    }

    public String toString()
    {
        return "Tipo excepcion " + getClass().getName() + " error " + getMessage();
    }


}
