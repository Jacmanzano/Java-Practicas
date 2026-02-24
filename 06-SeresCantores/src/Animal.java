public abstract class Animal extends SerVivo {
    private int numPatas;

    public Animal(String nombre, int numPatas) {
        super(nombre);
        this.numPatas = numPatas;
    }

    public int getNumPatas() { return numPatas; }

    @Override
    public String toString() {
        return super.toString() + " | Patas: " + numPatas;
    }
}