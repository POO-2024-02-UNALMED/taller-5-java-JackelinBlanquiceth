package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {
    private static List<Mamifero> listado = new ArrayList<>();
    private static int caballos = 0;
    private static int leones = 0;

    private Boolean pelaje;
    private Integer patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, Integer patas) {
        super(nombre, edad, habitat, genero, null); 
        listado.add(this);
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static List<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(List<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public Boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    @Override
    public String toString() {
        return String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
            getNombre(), getEdad(), getHabitat(), getGenero()
        );
    }
}
