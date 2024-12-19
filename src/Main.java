import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Principal registrar = new Principal();  // Nombre correcto del objeto es 'registrar'

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el salto de línea pendiente después de nextInt()

            if (opcion == 1) {
                // Ingresar cédula y nombre de hasta 3 clientes
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese su cédula:");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el salto de línea después de nextInt()

                    System.out.println("Ingrese su nombre:");
                    String nombre = scanner.nextLine();  // Leer nombre del cliente

                    registrar.agregarClientes(cedula, nombre);  // Llamar al método de la clase Principal para agregar el cliente
                }

            } else if (opcion == 2) {
                // Mostrar clientes registrados
                registrar.mostrarCliente();

            } else if (opcion == 3) {
                // Salir
                System.out.println("Saliendo...");
                break;  // Termina el bucle y cierra el programa

            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }
        scanner.close();  // Cerrar el scanner al final del programa
    }
}
