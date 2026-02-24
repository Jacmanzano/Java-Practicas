public class Gallo extends Animal implements PuedeCantar {
    private String color;

    public Gallo(String nombre, int numPatas, String color) {
        super(nombre, numPatas);
        this.color = color;
    }

    @Override
    public String alimentacion() {
        return "Maíz y granos";
    }

    @Override
    public void cantar() {
        System.out.println("Claudio canta: ¡Ki-kiri-kí!");
    }

    public String caracteristicas() {
        return "GALLO -> " + this.toString() + " | Color: " + color;
    }
}