import java.util.Scanner;

public class Pasajeros {
    // Lista de enlace doble para almacenar la información de los pasajeros (id, nombre,
    //nacionalidad, asiento).


    // al siguiente menú:
    //▪ Crea Pasajero.
    //▪ Edita Pasajero
    //▪ Elimina Pasajero.
    //▪ Asocia un pasajero a un vuelo.
    //▪ Muestra lista completa de Pasajero indicando un vuelo


    public static void main(String[] args) {

        System.out.println("Si");
    }

    private static void crearPasajero() {

    }

    private static void editarPasajero(Pasajero pasajero) {

    }

    private static void eliminarPasajero(Pasajero pasajero) {

    }

    private static void mostrarPasajeros() {

    }

    private static Pasajero buscarPasajero(int idPasajero) {

    }

    public static void menuPasajeros(Scanner scanner) {
        System.out.println("Menu de Pasajeros");
        System.out.println("1. Crear pasajeros");
        System.out.println("2. Editar pasajero");
        System.out.println("3. Eliminar pasajero");
        System.out.println("4. Mostrar pasajeros");
        System.out.println("0. Salir");

        int opcion = scanner.nextInt(),
            idPasajero;
        scanner.nextLine();

        Pasajero pasajero;

        do {
            switch (opcion) {
                case 1:
                    crearPasajero();
                    break;

                case 2:
                    idPasajero = scanner.nextInt();
                    pasajero = buscarPasajero(idPasajero);
                    editarPasajero(pasajero);
                    break;
                case 3:
                    idPasajero = scanner.nextInt();
                    pasajero = buscarPasajero(idPasajero);
                    editarPasajero(pasajero);
                    break;

                case 4:
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
