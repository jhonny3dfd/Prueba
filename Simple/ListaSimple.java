package Simple;
import Doble.*;
import java.util.Scanner;

public class ListaSimple {

    Nodo inicio;
    Scanner scanner = new Scanner(System.in);

    public ListaSimple() {
        this.inicio = null;
    }

    public void Agregar(Vuelo vuelo) {
        Nodo n = new Nodo(vuelo);
        n.setSiguiente(inicio); 
        inicio = n; 
    }
    public void Editar(String nombre) {
        Nodo actual = inicio;
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            if (actual.getVuelo().getNombre().equals(nombre)) {
                System.out.println("Ingrese Destino: ");
                String nuevodestino = scanner.nextLine();
                System.out.println("Ingrese Horario: ");
                String nuevohorario = scanner.nextLine();
                System.out.println("Ingrese nombre: ");
                String nuevonombre = scanner.nextLine();
                System.out.println("Ingrese capacidad: ");
                int nuevacapacidad = scanner.nextInt();
                actual.getVuelo().setDestino(nuevodestino);
                actual.getVuelo().setHorario(nuevohorario);
                actual.getVuelo().setNombre(nuevonombre);
                actual.getVuelo().setCapacidad(nuevacapacidad);
                encontrado = true;
            }
            actual = actual.getSiguiente();
        }
        if (encontrado) {
            System.out.println("El vuelo de nombre: " + nombre + ", ha sido editado con exito");
        } else {
            System.out.println("El nombre: " + nombre + " no fue encontrado");
        }
    }
    public void Eliminar(String Nombre) {
        if (inicio != null) {
            Nodo actual = inicio;
            Nodo anterior = null;

            while (actual != null && !actual.getVuelo().getNombre().equals(Nombre)) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if (actual != null) {

                if (actual.getVuelo().getNumpasajeros() > 0) {
                    System.out.println("No se puede eliminar el vuelo " + Nombre + " porque tiene pasajeros asociados.");
                } else {
                    if (anterior == null) {
                        inicio = actual.getSiguiente();
                    } else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    System.out.println("Vuelo " + Nombre + " eliminado correctamente.");
                }
            } else {
                System.out.println("El vuelo con nombre " + Nombre + " no fue encontrado.");
            }
        } else {
            System.out.println("La lista de vuelos está vacía.");
        }

    }

    public void imprimirLista() {
        Nodo recorre = inicio;
        if (inicio != null) {
            while (recorre != null) {
                System.out.print(recorre.getVuelo().Mostrar()); 
                recorre = recorre.getSiguiente();
            }
            System.out.println();
        } else {
            System.out.println("Lista de Vuelos vacia");
        }
    }
    public Nodo Buscar(String nombre) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getVuelo().getNombre().equals(nombre)) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("Vuelo no encontrado");
        return null;

    }
    public void AsociarPasajero(String nombreVuelo, Pasajero pasajero) {
        Nodo nodoVuelo = Buscar(nombreVuelo);
        if (nodoVuelo != null) {
            nodoVuelo.getVuelo().AsociarPasajero(pasajero);
        } else {
            System.out.println("No se asocio el pasajero. Vuelo no encontrado.");
        }
    }

    public static void menuVuelos(Scanner scanner) {
        ListaSimple listavuelo = new ListaSimple();
        int opcion;

        do {
            System.out.println("Menu de Vuelos:");
            System.out.println("1. Crear Vuelo");
            System.out.println("2. Editar Vuelo");
            System.out.println("3. Eliminar Vuelo");
            System.out.println("4. Mostrar Lista de Vuelos");
            System.out.println("0. Salir del menu");
            System.out.println("Seleccione una de las opciones: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                System.out.println("---------------");
                System.out.println("Ingrese Destino: ");
                String destino = scanner.nextLine();
                System.out.println("Ingrese Horario: ");
                String horario = scanner.nextLine();
                System.out.println("Ingrese nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese capacidad: ");
                int capacidad = scanner.nextInt();
                Vuelo vuelo = new Vuelo(destino, horario, nombre, capacidad);
                listavuelo.Agregar(vuelo);
                System.out.println("Vuelo Creado con exito");
                break;
            case 2:
                System.out.println("Ingrese el nombre del vuelo: ");
                nombre = scanner.nextLine();
                listavuelo.Editar(nombre);
                break;
            case 3:
                System.out.println("Ingrese el nombre del vuelo: ");
                nombre = scanner.nextLine();
                listavuelo.Eliminar(nombre);
                break;
            case 4:
                listavuelo.imprimirLista();
                break;
            case 5:
                System.out.println("Salinedo del menu");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }while (opcion != 5);
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuVuelos(scanner);
        scanner.close();
    }
}

