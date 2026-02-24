import java.util.Scanner;

public class Principal {
	
	static Biblioteca biblioteca = new Biblioteca();
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion = 0;
		
		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			try {
				switch(opcion) {
				
				case 1:
					agregarMaterial();
				break;
				
				case 2:
					mostrarMateriales();
				break;
				
				case 3:
					prestarMaterial();
				break;
				
				}
			} catch (Exception e) {
				System.out.println("\nOpcion incorrecta.");
			}
		} while (opcion != 4);
		
	}
	public static void mostrarMenu() {
		String menu = "------BIENVENIDO------" +
						"\n1: Agregar Material" +
						"\n2: Mostrar Materiales" + 
						"\n3: Prestar Material" + 
						"\n4: Salir";
		
		System.out.println(menu);
	}
	public static void agregarMaterial() {
		boolean prestado = false;
		
		System.out.println("\nTitulo: ");
		String t = teclado.next();
		
		System.out.println("\nAutor: ");
		String a = teclado.next();
		
		System.out.println("\nFecha publicacion: ");
		int fecha = teclado.nextInt();
		
		System.out.println("\nLibro (L) o  Revista (R)?");
		String tipo = teclado.next();
		
		if(tipo.equalsIgnoreCase("L")) {
			System.out.println("\nGenero: ");
			String genero = teclado.next();
			
			Libro nuevoL = new Libro(t, a, fecha, genero);
			biblioteca.agregarMaterial(nuevoL);
			
		} else if(tipo.equalsIgnoreCase("R")) {
			System.out.println("\nNumero edicion: ");
			int numE = teclado.nextInt();
			
			Revista nuevaR = new Revista(t, a, fecha, numE);
			biblioteca.agregarMaterial(nuevaR);
		} else {
			System.out.println("\nIntroduce una opcion valida.");
		}
	}
	public static void mostrarMateriales() {
		System.out.println() //FALTA POR HACER
		
		biblioteca.buscarPorTitulo(S)
	}
	public static void prestarMaterial() {
		System.out.println("\nDime el nombre de el libro: ");
		String nombre = teclado.next();
		
		MaterialBibliografico m = biblioteca.buscarPorTitulo(nombre);
		biblioteca.realizarPrestamo(m);
	}
	public static int leerEntero(String mensaje) {
		int numero = 0;
		boolean esNumero = false;
		
		while(esNumero != true) {
			System.out.println(mensaje);
			try {
				numero = teclado.nextInt();
				esNumero = true;
			} catch (Exception e) {
				System.out.println("\nIntroduce un numero valido");
				teclado.next();
			}
		}
		return numero;
	}
}
