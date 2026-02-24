
public class Manual extends Coche {
	
	private String colorPalanca;
	
	public Manual(String marca, String matricula, String colorPalanca) {
		super(marca, matricula);
		this.colorPalanca = colorPalanca;
	}
	public void cambiarMarcha(int march) {
		if(march >= 1 && march <= 5) {
			super.cambiarMarcha(march);
			System.out.println("El cambio es manual, la marcha acual es: " + march);
		} else {
			System.out.println("Marcha incorrecta.");
		}
	}
	public String toString() {
		return "Marca: " + super.getMarca() + "\nMatricula: " + super.getMatricula() + 
				"\nVelocidad: " + super.getVelocidad() + "\nMarcha: " + super.getMarcha() +
				"\nColor Palanca: " + colorPalanca + "\n";
	}
}
