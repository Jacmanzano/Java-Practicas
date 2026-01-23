import javax.swing.JOptionPane;
import java.util.Random;

public class Fabrica {
	
	static Coche[] almacen = new Coche[Coche.getMaxCoches()];

    public static void main(String[] args) {  	
    	int opcionSeleccionada = 0;
    	String menu = "---------MENÚ FÁBRICA---------\n"
    			+ "1. Fabricar coche (con matricula)\n"
				+ "2. Fabricar coche (nºpuertas y  nºplazas\n"
				+ "3. Fabricar coche (marca, el modelo y el color)\n"
				+ "4. Fabricar coche (sin datos)\n"
				+ "5. Tunear coche (pintándolo)\n"
				+ "6. Tunear coche (sin pintarlo)\n"
				+ "7. Avanzar kilómetros\n"
				+ "8. Mostrar características\n"
				+ "9. Salir";
    	
    	
    	do {
    		opcionSeleccionada = Integer.parseInt(JOptionPane.showInputDialog(menu));
    		
    		if(Coche.getNumCoches() <= Coche.getMaxCoches()) {
        		switch(opcionSeleccionada) {
        		case 1: 
        			String matr = JOptionPane.showInputDialog("Introduce la matricula");
        			
        			int posicion = Coche.getNumCoches();
        			
        			Coche nvcoche = new Coche(matr);
        			almacen[posicion] = nvcoche;
        			
        			mostrarCaracteristicasActuales(almacen, posicion);
        		break;
        		
        		case 2:
        			int pue = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de Puertas"));
        			int pla = Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de Plazas"));
        		
        			int posicion2 = Coche.getNumCoches();
        			
        			Coche nv2coche = new Coche(pue, pla);
        			nv2coche.setMatricula(matAleatoria());
        			almacen[posicion2] = nv2coche;
        			
        			mostrarCaracteristicasActuales(almacen, posicion2);
        		break;
        		
        		case 3:
        			String marca1 = JOptionPane.showInputDialog("Introduce la marca");
        			String modelo1 = JOptionPane.showInputDialog("Introduce el modelo");
        			String color1 = JOptionPane.showInputDialog("Introduce el color");
        			
        			int posicion3 = Coche.getNumCoches();
        			
        			Coche nv3coche = new Coche(marca1, modelo1, color1);
        			nv3coche.setMatricula(matAleatoria());
        			almacen[posicion3] = nv3coche;
        			
        			mostrarCaracteristicasActuales(almacen, posicion3);
        		break;
        		
        		case 4:
        			Coche nv4coche = new Coche();
        			nv4coche.setMatricula(matAleatoria());
        			
        			int posicion4 = Coche.getNumCoches();
        			almacen[posicion4] = nv4coche;
        			
        			mostrarCaracteristicasActuales(almacen, posicion4);
        		break;
        		
        		case 5:
        			String matricula5 = JOptionPane.showInputDialog("Matricula: ");
        			int p5 = buscaCoche(almacen, matricula5);
        			
        			if(p5 != -1) {
        				almacen[p5].tunear(JOptionPane.showInputDialog("Nuevo color: "));
        			} else {
        				JOptionPane.showMessageDialog(null, "Coche no encontrado");
        			}
        		break;
        		
        		case 6:
        			String matricula6 = JOptionPane.showInputDialog("Matricula: ");
        			int p6 = buscaCoche(almacen, matricula6);
        			
        			if(p6 != -1) {
        				almacen[p6].tunear();
        			}
        		break;
        		
        		case 7:
        			String matricula7 = JOptionPane.showInputDialog("Matricula: ");
        			int p7 = buscaCoche(almacen, matricula7);
        			
        			if(p7 != -1) {
        				int km = Integer.parseInt(JOptionPane.showInputDialog("Introduce los kilometros: "));
        				almacen[p7].avanzar(km);
        			}
        		break;
        		
        		case 8:
        			mostrarCaracteristicas();
        		break;
        		}
    		} else {
    			JOptionPane.showMessageDialog(null, "Numero maximo de coches alcanzado.");
    			break;
    		}
    	} while (opcionSeleccionada != 9);
    }
    
    //METODO MATRICULA ALEATORIA
    public static String matAleatoria() {
    	String matricula = "";
    	
    	for(int x= 0; x < 5; x++) {
    	matricula += (int)(Math.random() * 10); //NUMEROS RANDOM MATRICULA
    	}
    	return matricula;
    }
    
    //METODO BUSCA COCHE
    public static int buscaCoche(Coche[] coches, String matricula) {
    	for(int x= 0; x < coches.length; x++) {
    		if(coches[x] != null && coches[x].getMatricula().equals(matricula)) {
    			return x; //SI EXISTE DEV POSICION
    		}
    	}
    	return -1; //NO EXISTE
    }
    
    //METODO MOSTRAR CARACTERISTICAS
    public static void mostrarCaracteristicas() {
    	String matricula = JOptionPane.showInputDialog("Introduce la matricula: ");
    	int posicion = buscaCoche(almacen, matricula);
    	
    	if(posicion != -1) {
    		Coche seleccionado = almacen[posicion];
    		
    		String techoSolar;
    		if(seleccionado.siLlevaTechoSolar()){
    			techoSolar = "SI";
    		} else {
    			techoSolar = "NO";
    		}
    		String mensaje = "CARACTERÍSTICAS DEL COCHE\n" +
                    "------------------------------------------\n" +
                    " Matrícula: " + seleccionado.getMatricula() + "\n" +
                    " Marca: " + seleccionado.getMarca() + "\n" +
                    " Modelo: " + seleccionado.getModelo() + "\n" +
                    " Color: " + seleccionado.getColor() + "\n" +
                    " Techo Solar: " + techoSolar + "\n" +
                    " Kilómetros: " + seleccionado.getKilometros() + " km\n" +
                    " Puertas: " + seleccionado.getNumPuertas() + "\n" +
                    " Plazas: " + seleccionado.getNumPlazas();
    		
    		JOptionPane.showMessageDialog(null, mensaje);
    	} else {
    		JOptionPane.showMessageDialog(null, "Coche no encontrado");
    	}
    }
    public static void mostrarCaracteristicasActuales(Coche[] coche, int posicion) {
    	
		String techoSolar;
		if(coche[posicion].siLlevaTechoSolar()){
			techoSolar = "SI";
		} else {
			techoSolar = "NO";
		}
    	
		String mensaje = "CARACTERÍSTICAS DEL COCHE CREADO\n" +
                "------------------------------------------\n" +
                " Matrícula: " + coche[posicion].getMatricula() + "\n" +
                " Marca: " + coche[posicion].getMarca() + "\n" +
                " Modelo: " + coche[posicion].getModelo() + "\n" +
                " Color: " + coche[posicion].getColor() + "\n" +
                " Techo Solar: " + techoSolar + "\n" +
                " Kilómetros: " + coche[posicion].getKilometros() + " km\n" +
                " Puertas: " + coche[posicion].getNumPuertas() + "\n" +
                " Plazas: " + coche[posicion].getNumPlazas();
		
		JOptionPane.showMessageDialog(null, mensaje);
    }
}