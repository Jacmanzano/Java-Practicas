import javax.swing.JOptionPane;

public class Coche {
	
	static private int numCoches;
	static private final int MAX_COCHES = 5;
	
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private boolean llevaTechoSolar;
    private double kilometros;
    private int numPuertas;
    private int numPlazas;

    private void cargarValoresPorDefecto() {
        this.matricula = "SIN MATRICULA";
        this.marca = "SEAT";
        this.modelo = "ALTEA";
        this.color = "BLANCO";
        this.llevaTechoSolar = false;
        this.kilometros = 0.0;
        this.numPuertas = 3;
        this.numPlazas = 5;
    }

    public Coche() {
        cargarValoresPorDefecto();
    }

    public Coche(String matricula) {
        cargarValoresPorDefecto();
        this.matricula = matricula;
    }

    public Coche(int numPuertass, int numPlazass) {
        cargarValoresPorDefecto();
        
        if (numPuertas <= 5) {
        	numPuertas = numPuertass;
        } else {
        	numPuertas = 5;
        }

        if (numPlazas <= 7) {
        	numPlazas = numPlazass;
        } else {
        	numPlazas = 7;
        }
    }

    public Coche(String marcas, String modelos, String colors) {
        cargarValoresPorDefecto();
        marca = marcas;
        modelo = modelos;
        color = colors;
    }

    public void avanzar(double km) {
        kilometros += km;
        JOptionPane.showMessageDialog(null, "El coche avanza " + km + " km. Total: " + this.kilometros);
    }

    public void tunear() {
        this.kilometros = 0;
        if (llevaTechoSolar == false) {
            llevaTechoSolar = true;
            JOptionPane.showMessageDialog(null, "Coche tuneado: Techo solar instalado. KM a 0.");
        } else {
            JOptionPane.showMessageDialog(null, "Se han reseteado los KM. Ya tenía techo solar.");
        }
    }

    public void tunear(String colores) {
        color = colores;
        tunear();
        JOptionPane.showMessageDialog(null, "Coche pintado de " + color);
    }

    public void matricular(String matricular) {
        matricula = matricular;
        JOptionPane.showMessageDialog(null, "Matriculado con éxito: " + this.matricula);
    }
    public static int getNumCoches() {
    	return numCoches;
    }
    public static int getMaxCoches() {
    	return MAX_COCHES;
    }
    
    
    
    //GETTERS Y SETTERS
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean siLlevaTechoSolar() {
		return llevaTechoSolar;
	}
	public void setLlevaTechoSolar(boolean llevaTechoSolar) {
		this.llevaTechoSolar = llevaTechoSolar;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	public int getNumPlazas() {
		return numPlazas;
	}
	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}
}
