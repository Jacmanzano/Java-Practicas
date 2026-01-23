import java.util.Random;

public class Administracion {
	static int tres;
	static int cuatro;
	static int cinco;
	static int reint;
	static int apuestasTotales = 10;
    static Random azar = new Random();
	
	public static void main(String[] args) {
		Sorteo sorteo = new Sorteo();
		generarSorteo(sorteo);
		System.out.println("Numeros premiados: " + sorteo.listaSorteo + " R" + sorteo.getReintegro());
		
		for(int x= 0; x < apuestasTotales; x++) {
			Apuesta apuesta = new Apuesta();
			generarApuesta(apuesta);
			System.out.println(apuesta.listApuesta + " R" + apuesta.getReintegro());
			System.out.println(comprobarApuesta(sorteo, apuesta));
		}
	}
	public static String comprobarApuesta(Sorteo sorteoActual, Apuesta apuesta) {
		int aciertos = 0;
		
		for(int x= 0; x < 5; x++) {
			int numeroApuesta = apuesta.listApuesta.get(x);
			
			if(sorteoActual.listaSorteo.contains(numeroApuesta)) {
				aciertos++;
			}
		}
		
		boolean hayReintegro = (sorteoActual.getReintegro() == apuesta.getReintegro());
		int premio = 0;
		
		if(hayReintegro) {
			premio += 1;
			reint++;
		}
		if(aciertos == 3) {
			premio += 4;
			tres++;
		}
		if(aciertos == 4) {
			premio += 500;
			cuatro++;
		}
		if(aciertos == 5) {
			premio += 400000;
			cinco++;
		}
		return "Aciertos: " + aciertos + " numeros, Reintegro: " + hayReintegro + ", Premio: " + premio + "€";
	}
	public static String comprobarPremio(int aciertos, boolean acertarReintegro) {
		int premioTotal = 0;
		
		if(acertarReintegro) {
			premioTotal += 1;
		}
		if(aciertos == 3) {
			premioTotal += 4;
		} else if(aciertos == 4) {
			premioTotal += 500;
		} else if(aciertos == 5) {
			premioTotal += 400000;
		}
		return "Premio total: " + premioTotal + "€";
	}
	public static void generarSorteo(Sorteo sorteoActual) {
	     while (sorteoActual.listaSorteo.size() < 5) {
	         int n = azar.nextInt(49) + 1;
	         if (!sorteoActual.listaSorteo.contains(n)) sorteoActual.listaSorteo.add(n);
	     }
	     sorteoActual.setReintegro(azar.nextInt(10));
	 }
	 public static void generarApuesta(Apuesta apuesta) {
	     while (apuesta.listApuesta.size() < 5) {
	         int n = azar.nextInt(49) + 1;
	         if (!apuesta.listApuesta.contains(n)) apuesta.listApuesta.add(n);
	     }
	   apuesta.setReintegro(azar.nextInt(10));
	}
}
