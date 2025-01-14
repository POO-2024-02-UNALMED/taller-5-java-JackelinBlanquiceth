package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	public static int iguanas = 0;
	public static int serpientes = 0;
    private static List<Reptil> listado = new ArrayList<>();

    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero); 
        listado.add(this);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }
    public Reptil() {
        super();
        listado.add(this);
        this.colorEscamas = null;
        this.largoCola = 0;
    }


    public static int cantidadReptiles() {
        return listado.size();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

    public String movimiento() {
        return "reptar";
    }

    public static List<Reptil> getListado() {
        return Reptil.listado;
    }

    public static void setListado(List<Reptil> reptiles) {
        Reptil.listado = reptiles;
    }

    public String getColorEscamas() {
        return this.colorEscamas;
    }

    public void setColorEscamas(String color) {
        this.colorEscamas = color;
    }

    public int getLargoCola() {
        return this.largoCola;
    }

    public void setLargoCola(int largo) {
        this.largoCola = largo;
    }

    @Override
    public String toString() {
        return String.format(
            "Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s",
            getNombre(), getEdad(), getHabitat(), getGenero()
        );
    }
}
