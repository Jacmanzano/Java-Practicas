
public class Arbitro {

	private String nombre;
	private String colegio;
	private int velocidad;
	private int acierto;
	
	public Arbitro (String nombre, String colegio, int velocidad, int acierto) {
		this.nombre = nombre;
		this.colegio = colegio;
		this.velocidad = velocidad;
		this.acierto = acierto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColegio() {
		return colegio;
	}

	public void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAcierto() {
		return acierto;
	}

	public void setAcierto(int acierto) {
		this.acierto = acierto;
	}

	public String toString() {
		return "Arbitro [nombre=" + nombre + ", colegio=" + colegio + ", velocidad=" + velocidad + ", acierto="
				+ acierto + "]";
	}
}
