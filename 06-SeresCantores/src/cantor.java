public class cantor {
    public static void main(String[] args) {
    	
        Cantante cant = new Cantante("Carreras", 66);
        Canario cana = new Canario("Piolín", 2, 15.5);
        Gallo ga = new Gallo("Claudio", 2, "Blanco");

        System.out.println(cant.caracteristicas());
        cant.cantar();
        System.out.println("----------------------------------");

        System.out.println(cana.caracteristicas());
        cana.cantar();
        System.out.println("----------------------------------");

        System.out.println(ga.caracteristicas());
        ga.cantar();
    }
}