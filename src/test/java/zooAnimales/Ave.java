package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {
    private static List<Ave> listado = new ArrayList<>();
    public static int halcones = 0;
    public static int aguilas = 0;

    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero); 
        listado.add(this);
        this.colorPlumas = colorPlumas;
    }
    public Ave() {
        super();
        listado.add(this);
        this.colorPlumas = null;
    }


    public static List<Ave> getListado() {
        return Ave.listado;
    }

    public static void setListado(List<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return this.colorPlumas;
    }

    public void setColorPlumas(String color) {
        this.colorPlumas = color;
    }

    public static int cantidadAves() {
        return listado.size();
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }

    public String movimiento() {
        return "volar";
    }

    @Override
    public String toString() {
        return String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
            getNombre(), getEdad(), getHabitat(), getGenero()
        );
    }
}
