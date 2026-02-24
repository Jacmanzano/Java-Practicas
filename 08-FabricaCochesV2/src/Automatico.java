
public class Automatico extends Coche implements IDeportivo {
	String tipoLeva;
	
	public Automatico(String marca, String matricula, String tipoLeva) {
		super(marca, matricula);
		this.tipoLeva = tipoLeva;
	}
	public void acelerar (int velo) {
		
		int velocidadTotal = 0;
				
		if(velo > 0) {
			velocidadTotal += super.getVelocidad() + velo;
			super.setVelocidad(velocidadTotal);
		} else {
			System.out.println("La velocidad debe ser positiva");
		}
	}
	public void frenar(int velo) {
		
		int velocidadTotal = 0;
		
		if(super.getVelocidad() - velo >= 0) {
			velocidadTotal = super.getVelocidad() - velo;
			super.setVelocidad(velocidadTotal);
		} else {
			System.out.println("La frenada no es valida");
		}
	}
	public void turbo() {
		int velocidadDividido = super.getVelocidad() / 5;
		int velocidadTotal = super.getVelocidad() + velocidadDividido;
		super.setVelocidad(velocidadTotal);
	}
	public String toString() {
		return "Marca: " + super.getMarca() + "\nMatricula: " + super.getMatricula() + 
				"\nVelocidad: " + super.getVelocidad() + "\nMarcha: " + super.getMarcha() +
				"\nLeva: " + tipoLeva + "\n";
	}
}
