package Ejercitacion;

import java.util.ArrayList;

public class Puerto {

    private ArrayList<Contenedor> contenedores;

    public Puerto() {
        contenedores = new ArrayList<>();
    }

    public void ingresarContenedor (Contenedor contenedor){
        contenedores.add(contenedor);
    }

    public String mostrarContenedores(){
        String lista = "";
        contenedores.sort(null);
        for (Contenedor contenedor:contenedores){
            lista += contenedor.toString() + "\n";
        }
        return lista;
    }

    public int cantidadContenedoresPeligrosos(String pais){
        int cantPeligrosos = 0;
        for (Contenedor contenedor:contenedores){
            if (contenedor.getPais() == pais)
                cantPeligrosos++;
        }
        return cantPeligrosos;
    }

}
