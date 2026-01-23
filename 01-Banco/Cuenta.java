public class Cuenta {
	private String nombre;
	private String apellidos;
	private String contrasenia;
	String dni;
	private double saldo;
	
	public Cuenta(String nombre, String apellidos, String dni, double saldoinicial, String contrasenia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.saldo = saldoinicial;
	}
	public void depositar(double cantidad) {
		if(cantidad > 0) {
			this.saldo += cantidad;
		} else {
			System.out.println("La cantidad a ingresar debe ser mayor a 0.");
		}
	}
	public void retirar(double cantidad) {
		if(cantidad > 0 && cantidad <= saldo) {
			this.saldo -= cantidad;
		} else {
			System.out.println("La cantidad debe ser mayor a 0, y menor a la cantidad total.");
		}
	}
	public double getSaldo() {
		return saldo;
		}
	public String getNombreCompleto() {
		return nombre + " " + apellidos;
	}
	public String getContrasenia() {
		return contrasenia;
	}
}

//CARLOS MANZANO REGALADO 1ºDAM