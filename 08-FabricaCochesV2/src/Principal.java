import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Coche> listaCo = new ArrayList<>();
	static Coche CocheSeleccionado;
	
	public static void main(String[] args) {
		
		int opcionMenu = 0;
		
		do {
			mostrarMenu();
			opcionMenu = leerEntero("Introduce una opcion: ");
				
				switch(opcionMenu) {
				case 1:
					crearCoche();
					break;
					
				case 2:
					Coche c = seleccionarCoche();
					if(c != null) {
						
						if(c instanceof Manual) {
							int nuevaMarcha = leerEntero("\nIntroduce la nueva marcha: ");
							c.cambiarMarcha(nuevaMarcha);
							
						} else if (c instanceof Automatico) {
							int cantidadAcelerar = leerEntero("\nIntroduce la cantidad a acelerar: ");
							c.acelerar(cantidadAcelerar);
						}
						System.out.println("\n-----INFORMACION ACTUALIZADA-------");
						System.out.println(c.toString());
					}
				break;
				
				case 3:
					Coche c2 = seleccionarCoche();
					if(c2 != null) {
						int cantidadAFrenar = leerEntero("\nIntroduce la cantidad a frenar: ");
						c2.frenar(cantidadAFrenar);
					}
					System.out.println("\n-----INFORMACION ACTUALIZADA-------");
					System.out.println(c2.toString());
					break;
					
				case 4:
					System.out.println("-------COCHES DE MENOR A MAYOR VELOCIDAD-------\n");
					listaCo.sort(Comparator.comparingInt(Coche::getVelocidad));
					for(Coche co : listaCo) {
						System.out.println(co);
					}
				break;
				
				case 5:
					System.out.println("---------COCHES POR MARCA---------\n");
					listaCo.sort(Comparator.comparing(Coche::getMarca));
					for(Coche co : listaCo) {
						System.out.println(co);
					}
				}
		} while (opcionMenu != 6);
	}
	
	public static void mostrarMenu() {
		String menu = "1: Crear coche"+ "\n2: Acelerar o cambiar de marcha (manual)" + 
				"\n3: Frenar Coche" + "\n4: Ordenar por velocidad" + 
				"\n5: Ordenar por marca" + "\n6: Salir\n";
		
		System.out.println(menu);
	}
	
	public static void crearCoche() {
		System.out.println("\nIntroduce la marca: ");
		String marca = teclado.next();
		
		System.out.println("\nIntroduce la matricula: ");
		String matricula = teclado.next();
		
		System.out.println("\nIntroduce el timpo de coche (M = manual) (A = Automatico)");
		String tipo = teclado.next();
		
		
		//AUTOMATICO
		if(tipo.equalsIgnoreCase("A")) {
			System.out.println("\nIntroduce el tipo de leva");
			String tipoLeva = teclado.next();
			
			Automatico nuevoCoche = new Automatico(marca, matricula, tipoLeva);
			listaCo.add(nuevoCoche);
			System.out.println("El coche se ha creado correctamente.\n");
			
			//MANUAL
		} else if(tipo.equalsIgnoreCase("M")) {
			System.out.println("\nDime el color de la palanca de cambios");
			String colorPalanca = teclado.next();
			
			Manual nuevoCoche = new Manual(marca, matricula, colorPalanca);
			listaCo.add(nuevoCoche);
			System.out.println("El coche se ha creado correctamente.\n");
		} else {
			System.out.println("\nTienes que elegir entre M o A\n");
		}
	}
	public static Coche seleccionarCoche() {
		System.out.println("\nIntroduce la matricula de el coche: ");
		String matriculaSeleccionada = teclado.next();
		
		for(Coche c : listaCo) {
			if(c.getMatricula().equals(matriculaSeleccionada)) {
				return c;
			}
		}
		System.out.println("\nCoche no encontrado.");
		return null;
	}
	public static void mostrarCoche() {
		System.out.println("Introduce la matricula: ");
		String matriculaNueva = teclado.next();
		
		for(Coche coche : listaCo) {
			if(coche.getMatricula().equals(matriculaNueva)) {
				System.out.println("---------MOSTRANDO DATOS DEL COCHE-----------\n");
				coche.toString();
			} else {
				System.out.println("El coche no existe.");
			}
		}
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
				System.out.println("Introduce un numero valido");
				teclado.next();
			}
		}
		return numero;
	}
}
