package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
    private static int salmones = 0;
    private static int bacalaos = 0;
    private static List<Pez> listado = new ArrayList<>();

    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, null); 
        listado.add(this);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public static List<Pez> getListado() {
        return listado;
    }

    public static void setListado(List<Pez> peces) {
        Pez.listado = peces;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidad) {
        this.cantidadAletas = cantidad;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

    @Override
    public String toString() {
        return String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
            getNombre(), getEdad(), getHabitat(), getGenero()
        );
    }
}
