
public class Jugador {

	private String nombre;
	private String posicion;
	private int velocidad;
	private int dribling;
	
	public Jugador(String nombre, String posicion, int velocidad, int dribling ) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.dribling = dribling;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDribling() {
		return dribling;
	}

	public void setDribling(int dribling) {
		this.dribling = dribling;
	}

	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", velocidad=" + velocidad + ", dribling="
				+ dribling + "]";
	}
}
