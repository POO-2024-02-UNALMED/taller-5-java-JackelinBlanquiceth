package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private String zoo;
    private List<String> animales;

    public Zona(String nombre, String zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZoo() {
        return zoo;
    }

    public void setZoo(String zoo) {
        this.zoo = zoo;
    }

    public void agregarAnimales(String animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }


}
