package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
    private static List<Anfibio> listado = new ArrayList<>();
    private static int ranas = 0;
    private static int salamandras = 0;

    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, null); 
        listado.add(this);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static List<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(List<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String color) {
        this.colorPiel = color;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }

    public String movimiento() {
        return "saltar";
    }

    @Override
    public String toString() {
        return String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
            getNombre(), getEdad(), getHabitat(), getGenero()
        );
    }
}
