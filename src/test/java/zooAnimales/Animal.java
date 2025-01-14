package zooAnimales;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }
    public Animal() {
        this.nombre = null;
        this.edad = 0;
        this.habitat = null;
        this.genero = null;
    }

    public String movimiento() {
    	return "desplazarse";
    };

    public static String totalPorTipo() {
        return String.format("Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d", 
            Mamifero.cantidadMamiferos(),
            Ave.cantidadAves(),
            Reptil.cantidadReptiles(),
            Pez.cantidadPeces(),
            Anfibio.cantidadAnfibios());
    }

    @Override
    public String toString() {
        return String.format("Mi nombre es %s, tengo una edad de %d, habito en %s y mi genero es %s", 
            this.nombre, this.edad, this.habitat, this.genero);
    }

  
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getHabitat() {
        return this.habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
