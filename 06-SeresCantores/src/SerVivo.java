public abstract class SerVivo {
    private String nombre;

    public SerVivo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract String alimentacion();

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Alimentación: " + alimentacion();
    }
}