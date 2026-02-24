
public class Libro extends MaterialBibliografico {
	
	private String genero;
	
	public Libro(String titulo, String autor, int publicadoEn, String genero) {
		super(titulo, autor, publicadoEn);
		this.genero = genero;
	}
	
	public void prestamo() {
		if(super.getPrestado() == false) {
			System.out.println("Este libro se te ha sido concedido.");
			super.SetPrestado(true);
		} else {
			System.out.println("Este libro no está disponible.");
		}
	}
	public String toString() {
		return super.toString() + "\nGenero: " + genero;
	}
}
