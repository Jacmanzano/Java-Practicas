import java.util.Scanner;

public class Banco {
    static Scanner entrada = new Scanner(System.in);
    static Cuenta[] lista_cuenta = new Cuenta[5];
    static int contadorCuentas = 0;

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\n--- BIENVENIDO AL BANCO ---");
            System.out.println("1) Crear cuenta");
            System.out.println("2) Acceder a cuenta");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    System.out.print("Ingrese su contraseña para acceder: ");
                    String pass = entrada.nextLine();
                    int posicion = buscarCuenta(pass);
                    
                    if (posicion != -1) {
                        switchCuenta(posicion);
                    } else {
                        System.out.println("Error: Contraseña no encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestro banco. Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    public static void crearCuenta() {
        if (contadorCuentas >= 5) {
            System.out.println("Error: El banco está lleno (máximo 5 cuentas).");
            return;
        }

        System.out.println("\n--- CREAR NUEVA CUENTA ---");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Apellidos: ");
        String apellidos = entrada.nextLine();
        
        System.out.print("DNI: ");
        String dni = entrada.nextLine();
        
        System.out.print("Saldo Inicial: ");
        double saldo = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Contraseña: ");
        String pass = entrada.nextLine();

        lista_cuenta[contadorCuentas] = new Cuenta(nombre, apellidos, dni, saldo, pass);
        contadorCuentas++;
        
        System.out.println("Cuenta creada exitodamente.");
    }

    public static int buscarCuenta(String password) {
        for (int i = 0; i < contadorCuentas; i++) {
            if (lista_cuenta[i].getContrasenia().equals(password)) {
                return i;
            }
        }
        return -1;
    }

    public static void switchCuenta(int posi_cuenta) {
        Cuenta cuentaActual = lista_cuenta[posi_cuenta];
        int opcion;

        System.out.println("\n--------------------------------");
        System.out.println("Hola " + cuentaActual.getNombreCompleto());
        
        do {
            System.out.println("\n--- MENÚ DE CUENTA ---");
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Ver Saldo");
            System.out.println("4) Salir de la cuenta");
            System.out.print("Elija una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a depositar: ");
                    double dep = entrada.nextDouble();
                    cuentaActual.depositar(dep);
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double ret = entrada.nextDouble();
                    cuentaActual.retirar(ret);
                    break;
                case 3:
                    System.out.println("Su saldo actual es: " + cuentaActual.getSaldo());
                    break;
                case 4:
                    System.out.println("Cerrando sesión de " + cuentaActual.getNombreCompleto() + "...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }
        } while (opcion != 4);
    }
}

//CARLOS MANZANO REGALADO 1ºDAM