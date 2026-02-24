public abstract class MaterialBibliografico {
	
	private String titulo;
	private String autor;
	private int publicadoEn;
	private boolean prestado;
	
	public MaterialBibliografico(String titulo, String autor, int publicadoEn) {
		this.titulo = titulo;
		this.autor = autor;
		this.publicadoEn = publicadoEn;
		this.prestado = false;
	}
	public abstract void prestamo();
	
	public String getTitulo() {
		return titulo;
	}
	public boolean getPrestado() {
		return prestado;
	}
	public void SetPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + titulo + "\nAutor: " + autor
				+ "\nPublicado en: " + publicadoEn + "\nPrestado: " + prestado;
	}
}
