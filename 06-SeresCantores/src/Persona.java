public abstract class Persona extends SerVivo {
    private int edad;

    public Persona(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return super.toString() + " | Edad: " + edad + " años";
    }
}