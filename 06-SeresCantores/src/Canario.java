public class Canario extends Animal implements PuedeCantar {
    private double peso;

    public Canario(String nombre, int numPatas, double peso) {
        super(nombre, numPatas);
        this.peso = peso;
    }

    @Override
    public String alimentacion() {
        return "Alpiste y semillas";
    }

    @Override
    public void cantar() {
        System.out.println("Piolín canta: ¡Pío, pío, pío!");
    }

    public String caracteristicas() {
        return "CANARIO -> " + this.toString() + " | Peso: " + peso + "g";
    }
}