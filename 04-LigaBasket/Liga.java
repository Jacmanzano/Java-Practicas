import java.util.Scanner;
import java.util.ArrayList;

public class Liga {
	
	static Scanner teclado = new Scanner(System.in);
	public static ArrayList<Object> listaPer = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int seleccion = 0;
		
		do {
			menu();
			System.out.println("\nIntroduce una opcion: ");
			seleccion = teclado.nextInt();
			System.out.println();
			
			switch (seleccion) {
			case 1:
				insertaJugador();
			break;
			
			case 2:
				insertaArbitro();
			break;
			
			case 3:
				mostrarTodo();
			break;
			
			case 4:
				mostrarSoloJugadores();
			break;
			
			case 5:
				JugadorMasDribling();
			break;
			}
		} while (seleccion != 6);
	}
	
	//MOSTAR MENU
	public static void menu() {
		String menu = "\n[1] Insertar jugador \n" + 
					 "[2] Insertar arbitro \n" + 
					 "[3] Mostrar todos los elementos\n" +
					 "[4] Mostrar solo jugadores\n" +
					 "[5] Jugador con más dribling (iterativo)\n" +
					 "[6] Salir";
		System.out.println(menu);		
	}
	
	//INSERTA JUGADOR
	public static void insertaJugador() {
		String nombrejug;
		String posicionjug;
		int velocidadjug;
		int driblingjug;
		
		System.out.println("-----MENU CREACION DE JUGADOR-----\n" + 
						   "Introduce el nombre: ");
		nombrejug = teclado.next();
		
		System.out.println("\nIntroduce la posicion: ");
		posicionjug = teclado.next();
		
		velocidadjug = (int)(Math.random() * 100);
		driblingjug = (int)(Math.random() * 100);
		
		Jugador nuevoJugador = new Jugador(nombrejug, posicionjug, velocidadjug, driblingjug);
		listaPer.add(nuevoJugador);
		
		System.out.println("\nJugador nuevo creado.\n");
	}
	
	//INSERTA ARBITRO
	public static void insertaArbitro() {
		String nombrearb;
		String colegioarb;
		int velocidadarb;
		int aciertoarb;
		
		System.out.println("-----MENU DE CREACION DE ARBITRO-----\n" + 
							"Introduce el nombre: ");
		nombrearb = teclado.next();
		
		System.out.println("\nIntroduce el colegio: ");
		colegioarb = teclado.next();
		
		velocidadarb = (int)(Math.random() * 100);
		aciertoarb = (int)(Math.random() * 100);
		
		Arbitro nuevoArbitro = new Arbitro (nombrearb, colegioarb, velocidadarb, aciertoarb);
		listaPer.add(nuevoArbitro);
	}
	
	//MOSTRAR TODO
	public static void mostrarTodo() {
			System.out.println("-----TODOS LAS PERSONAS-----");
			for(Object o : listaPer) {
				System.out.println(o + "\n");
		}
	}
	
	//MOSTRAR SOLO JUGADORES
	public static void mostrarSoloJugadores() {
		System.out.println("-----TODOS LOS JUGADORES-----");
		for(Object ob : listaPer) {
			if (ob instanceof Jugador) {
				System.out.println(ob + "\n");
			}
		}
	}
	//JUGADOR CON MAS DRIBLING
	public static void JugadorMasDribling() {
		int driblingMasAlto = 0;
		Jugador conMasDribling = null;
		
		for(Object obj : listaPer) {
			if(obj instanceof Jugador) {
				Jugador j = (Jugador) obj;
				
				if(j.getDribling() > driblingMasAlto) {
					driblingMasAlto = j.getDribling();
					conMasDribling = j;
				}
			}
		}
		System.out.println("El jugador con mas Dribling es: " + conMasDribling.getNombre() + "\n");
	}
}
