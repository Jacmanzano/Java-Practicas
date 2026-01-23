public class Alumnos {
    private String nia;
    private String nombre;
    private String apellidos;
    private int edad;
    private String grupo;
    private String telefono;

    public Alumnos(String nia, String nombre, String apellidos, int edad, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.grupo = grupo;
        this.telefono = telefono;
    }
    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void mostrarDatos() {
        System.out.println("---------------------------------");
        System.out.println("NIA: " + nia);
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Grupo: " + grupo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("---------------------------------");
    }
}