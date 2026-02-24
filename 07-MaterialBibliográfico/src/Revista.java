
public class Revista extends MaterialBibliografico {
	
	private int numeroEdicion;
	
	public Revista(String titulo, String autor, int publicadoEn, int numeroEdicion) {
		super(titulo, autor, publicadoEn);
		this.numeroEdicion = numeroEdicion;
	}
	public void prestamo() {
		if(super.getPrestado() == false) {
			System.out.println("\nEste libro se te ha sido concedido.");
			super.SetPrestado(true);
		} else {
			System.out.println("\nEste libro no está disponible.");
		}
	}
	public String toString() {
		return super.toString() + "\nNumero edicion: " + numeroEdicion;
	}
}
