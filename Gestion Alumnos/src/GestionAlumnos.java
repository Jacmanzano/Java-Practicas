import java.util.ArrayList;
import java.util.Scanner;

public class GestionAlumnos {

    static ArrayList<Alumnos> alumnos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // [cite: 61]
        int opcion;

        do {
            opcion = menuPrincipal();
            
            switch (opcion) {
                case 1:
                    nuevoAlumno();
                    break;
                case 2:
                    bajaAlumno();
                    break;
                case 3:
                    consultas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static int menuPrincipal() {
        System.out.println("\n--- GESTIÓN DE ALUMNOS ---");
        System.out.println("1. Nuevo alumno");
        System.out.println("2. Baja de alumno");
        System.out.println("3. Consultas");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        
        try {
            int op = Integer.parseInt(sc.nextLine());
            return op;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void nuevoAlumno() {
        System.out.println("\n--- NUEVO ALUMNO ---");
        
        System.out.print("Introduce el NIA: ");
        String nia = sc.nextLine();

        if (buscarPorNia(nia) != null) {
            System.out.println("Error: Ya existe un alumno con el NIA " + nia);
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        
        int edad = 0;
        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Edad: ");
                edad = Integer.parseInt(sc.nextLine());
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido para la edad.");
            }
        }

        System.out.print("Grupo: ");
        String grupo = sc.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        Alumnos nuevo = new Alumnos(nia, nombre, apellidos, edad, grupo, telefono);
        alumnos.add(nuevo);
        System.out.println("Alumno registrado correctamente.");
    }

    public static void bajaAlumno() {
        System.out.println("\n--- BAJA DE ALUMNO ---");
        System.out.print("Introduce el NIA del alumno a eliminar: ");
        String nia = sc.nextLine();

        Alumnos alumnoEncontrado = buscarPorNia(nia);

        if (alumnoEncontrado == null) {
            System.out.println("No se encontró ningún alumno con ese NIA.");
        } else {
            alumnoEncontrado.mostrarDatos();
            
            System.out.print("¿Está seguro de borrar este alumno? (s/n): ");
            String confirmacion = sc.nextLine();

            if (confirmacion.equalsIgnoreCase("s")) {
                alumnos.remove(alumnoEncontrado);
                System.out.println("Alumno eliminado.");
            } else {
                System.out.println("Operación cancelada.");
            }
        }
    }

    public static void consultas() {
        int opcion;
        do {
            opcion = menuConsultas();
            switch (opcion) {
                case 1:
                    consultaPorEdad();
                    break;
                case 2:
                    consultaPorNia();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static int menuConsultas() {
        System.out.println("\n--- CONSULTAS ---");
        System.out.println("1. Por edad");
        System.out.println("2. Por NIA");
        System.out.println("0. Volver");
        System.out.print("Seleccione una opción: ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void consultaPorEdad() {
        System.out.print("Introduce la edad a buscar: ");
        try {
            int edadBuscar = Integer.parseInt(sc.nextLine());
            boolean encontrado = false;

            System.out.println("\nResultados para edad " + edadBuscar + ":");
            for (Alumnos al : alumnos) {
                if (al.getEdad() == edadBuscar) {
                    al.mostrarDatos();
                    encontrado = true;
                }
            }
            if (!encontrado) System.out.println("No hay alumnos con esa edad.");

        } catch (NumberFormatException e) {
            System.out.println("Edad no válida.");
        }
    }

    public static void consultaPorNia() {
        System.out.print("Introduce el NIA a buscar: ");
        String niaBuscar = sc.nextLine();
        
        Alumnos al = buscarPorNia(niaBuscar);
        
        if (al != null) {
            al.mostrarDatos();
        } else {
            System.out.println("No se encontró ningún alumno con el NIA: " + niaBuscar);
        }
    }

    public static Alumnos buscarPorNia(String nia) {
        for (Alumnos al : alumnos) {
            if (al.getNia().equals(nia)) {
                return al;
            }
        }
        return null;
    }
}