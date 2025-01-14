package zooAnimales;

import gestion.Zona;
import zooAnimales.Ave;
import zooAnimales.Anfibio;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }

    public static String totalPorTipo() {
        return String.format(
            "Mamíferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
            Mamifero.cantidadMamiferos(),
            Ave.cantidadAves(),
            Reptil.cantidadReptiles(),
            Pez.cantidadPeces(),
            Anfibio.cantidadAnfibios()
        );
    }

    @Override
    public String toString() {
        if (zona == null) {
            return String.format(
                "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
                this.nombre, this.edad, this.habitat, this.genero
            );
        } else {
            return String.format(
                "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s, " +
                "la zona en la que me ubico es %s, en el zoológico %s",
                this.nombre, this.edad, this.habitat, this.genero, this.zona.getNombre(), this.zona.getZoo().getNombre()
            );
        }
    }

    public String movimiento() {
        return "desplazarse";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int total) {
        totalAnimales = total;
    }
}
