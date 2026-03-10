
public class Habitacion {
	
	private static int contadorId = 1;
	
	private int id;
	private int num_camas;
	private double precio;
	private String nombre;
	private boolean reservada;
	
	//CONSTRUCTOR POR DEFECTO
	public Habitacion(String nombre, int num_camas, double precio) {
		this.id = contadorId++;
		this.num_camas = num_camas;
		this.precio = precio;
		this.nombre = nombre;
		reservada = false;
	}
	//CONSTRUCTOR CON RESERVA
	public Habitacion(String nombre, int num_camas, double precio, boolean reservada) {
		this.id = contadorId++;
		this.num_camas = num_camas;
		this.precio = precio;
		this.nombre = nombre;
		this.reservada = reservada;
	}
	
	//RESERVAR
	public String reservar() {
		if(reservada == false) {
			reservada = true;
			return "Reserva completada";
		} else {
			return "No disponible";
		}
	}
	
	
	//GETTERS-SETTERS
	public int getId() {
		return id;
	}
	public int getNum_camas() {
		return num_camas;
	}
	public void setNum_camas(int num_camas) {
		this.num_camas = num_camas;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return "id: " + id + "\nNombre: " + nombre + "\nNumero de camas: " + num_camas 
				+ "\nPrecio: " + precio + "\nEstá reservada?: " + reservada;
	}
}
