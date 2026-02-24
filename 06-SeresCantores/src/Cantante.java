public class Cantante extends Persona implements PuedeCantar {
    public Cantante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String alimentacion() {
        return "Dieta equilibrada y miel para la garganta";
    }

    @Override
    public void cantar() {
        System.out.println("Carreras canta: ♪ Do, Re, Mi, Fa... ♪");
    }

    public String caracteristicas() {
        return "CANTANTE -> " + this.toString();
    }
}