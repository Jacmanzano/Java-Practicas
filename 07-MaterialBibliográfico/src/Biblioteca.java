import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<MaterialBibliografico> materiales = new ArrayList<>();
	
	public void agregarMaterial(MaterialBibliografico m) {
		materiales.add(m);
	}
	public void mostrarMateriales() {
		System.out.println("-----LISTA DE MATERIALES------");
		for(MaterialBibliografico b : materiales) {
			System.out.println(b.toString());
			System.out.println("-----------------------");
		}
	}
	public MaterialBibliografico buscarPorTitulo(String titulo) {
		for(MaterialBibliografico b : materiales) {
			if(titulo.equalsIgnoreCase(b.getTitulo())) {
				return b;
			}
		}
		return null;
	}
	public void realizarPrestamo(MaterialBibliografico m) {
		m.prestamo();
	}
}
