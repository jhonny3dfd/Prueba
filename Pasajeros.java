import java.util.Scanner;
import Doble.ListaEnlaceDoble;
import Doble.NodoListaDoble;
import Doble.Pasajero;

public class Pasajeros {

    private static ListaEnlaceDoble lista = new ListaEnlaceDoble();


    private static Pasajero crearPasajero() {
        Scanner scanner = new Scanner(System.in);
        // Aca crearlo
        System.out.println("Ingrese el ID");
        String id = scanner.nextLine();
        System.out.println("Ingrese el Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la nacionalidad");
        String nacionalidad = scanner.nextLine();
        System.out.println("Ingrese el Asiento");
        String asiento = scanner.nextLine();

        Pasajero nuevoPasajero = new Pasajero(id, nombre, nacionalidad, asiento);

        return nuevoPasajero;
    }

    private static void editarPasajero(Pasajero pasajero) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nuevo asiento: ");
        pasajero.setAsiento(scanner.nextLine());

        System.out.println("Pasajero modificado con exito.");
    }

    private static void eliminarPasajero(String pasajeroId) {
        lista.EliminarPasajero(pasajeroId);
    }

    private static void mostrarPasajeros() {
        lista.imprimirListaInicioFin();
    }

    private static Pasajero buscarPasajero(String idPasajero) {
        NodoListaDoble buscado = lista.Buscar(idPasajero);

        if (buscado == null) {
            return null;
        }

        return buscado.getPasajero();
    }

        private static void asociarPasajeros(String idVuelo) {
        System.out.println("Simulación: Pasajero asociado al vuelo con ID " + idVuelo);
    }



    public static void menuPasajeros(Scanner scanner) {
        System.out.println("Menu de Pasajeros");
        System.out.println("1. Crear pasajeros");
        System.out.println("2. Editar pasajero");
        System.out.println("3. Eliminar pasajero");
        System.out.println("4. Asociar pasajero a un vuelo");
        System.out.println("5. Mostrar pasajeros de un vuelo");
        System.out.println("0. Salir");

        int opcion = scanner.nextInt();
        String idPasajero;

        scanner.nextLine();

        Pasajero pasajero;

        do {
            switch (opcion) {
                case 1:
                    pasajero = crearPasajero();
                    lista.InsertaPasajero(pasajero);
                    break;

                case 2:
                    System.out.println("Ingrese el ID del pasajero:");
                    idPasajero = scanner.nextLine();
                    pasajero = buscarPasajero(idPasajero);
                    editarPasajero(pasajero);
                    break;
                case 3:
                    idPasajero = scanner.nextLine();
                    eliminarPasajero(idPasajero);
                    break;

                case 4:
                    idPasajero = scanner.nextLine();
                    pasajero = buscarPasajero(idPasajero);

                    String idVuelo = scanner.nextLine();
                    asociarPasajeros(idVuelo);
                    break;

                case 5:
                    mostrarPasajeros();
                    break;

                case 0:
                    System.out.println("Saliendo del menu");
                    break;

                default:
                    System.out.println("opcion invalida intentalo nuevamente");
                    break;
            }
        } while (opcion != 0);

    }

}
