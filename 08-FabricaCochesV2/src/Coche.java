abstract public class Coche {
	
	private String marca;
	private String matricula;
	private int velocidad;
	private int marcha;
	
	public Coche(String marca, String matricula) {
		this.marca = marca;
		this.matricula = matricula;
		velocidad = 0;
		marcha = 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public void acelerar (int velo) {
		
		if(velo > 0) {
			velocidad += velo;
		} else {
			System.out.println("La velocidad debe ser positiva");
		}
	}
	public void frenar(int velo) {
		
		if(velocidad - velo >= 0) {
			velocidad -= velo;
		} else {
			System.out.println("La frenada no es valida");
		}
	}
	public void cambiarMarcha(int march) {
		
		if(march >= 1 && march <= 5) {
			marcha = march;
		} else {
			System.out.println("La marcha debe de estar entre 1 y 5");
		}
	}
	public String toString() {
		
		return "Marca: " + marca + "\nMatrícula: " + matricula + 
				"\nVelocidad: " + velocidad + "\nMarcha" + marcha;
	}
}