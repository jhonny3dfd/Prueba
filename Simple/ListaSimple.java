package Simple;

import java.util.Scanner;

public class ListaSimple {
    protected Nodo inicio, fin;

    public ListaSimple() {
        inicio = null;
        fin = null;
    }

    public void agregarAlInicio(String nombre, String destino, String horario) {
        inicio = new Nodo(nombre, destino, horario, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void agregarAlFinal(String nombre, String destino, String horario) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(nombre, destino, horario);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(nombre, destino, horario);
        }
    }

    public String eliminarInicio() {
        String elemento = inicio.getNombre();
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            inicio = inicio.getSiguiente();
        }
        return elemento;
    }

    public String eliminarFinal() {
        String elemento = fin.getNombre();
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.getSiguiente() != fin) {
                temporal = temporal.getSiguiente();
            }
            fin = temporal;
            fin.setSiguiente(null);
        }
        return elemento;
    }

    public void editarVuelo(String nombre, String nuevoNombre, String nuevoDestino, String nuevoHorario) {
        Nodo actual = inicio;
        boolean encontrado = false;
        while (actual != null) {
            if (actual.getNombre().equalsIgnoreCase(nombre)) {
                if (nuevoNombre != null) actual.setNombre(nuevoNombre);
                if (nuevoDestino != null) actual.setDestino(nuevoDestino);
                if (nuevoHorario != null) actual.setHorario(nuevoHorario);
                encontrado = true;
                break;
            }
            actual = actual.getSiguiente();
        }

        if (encontrado) {
            System.out.println("Vuelo editado exitosamente.");
        } else {
            System.out.println("Vuelo no encontrado.");
        }
    }

    public void mostrarLista() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.getNombre() + ", " + recorrer.getDestino() + ", " + recorrer.getHorario() + "]--->");
            recorrer = recorrer.getSiguiente();
        }
        System.out.println();
    }

    public void eliminarVueloPorNombre(String nombre) {
        if (estaVacia()) {
            System.out.println("La lista está vacía. No se puede eliminar el vuelo.");
            return;
        }
        boolean estaAsociado = false; 

        if (estaAsociado) {
            System.out.println("No se puede eliminar el vuelo porque está asociado a pasajeros.");
            return;
        }
        if (inicio.getNombre().equalsIgnoreCase(nombre)) {
            eliminarInicio();
            System.out.println("Vuelo eliminado exitosamente.");
            return;
        }
        Nodo actual = inicio;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getNombre().equalsIgnoreCase(nombre)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() == null) {
            System.out.println("Vuelo no encontrado.");
        } else {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            if (actual.getSiguiente() == null) {
                fin = actual;
            }
            System.out.println("Vuelo eliminado exitosamente.");
        }
    }

    public static void menuVuelos(Scanner scanner) {
        ListaSimple vuelosList = new ListaSimple();
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
                    System.out.println("Ingrese el nombre del nuevo vuelo: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el destino del nuevo vuelo: ");
                    String destino = scanner.nextLine();
                    System.out.println("Ingrese el horario del nuevo vuelo: ");
                    String horario = scanner.nextLine();
                    vuelosList.agregarAlFinal(nombre, destino, horario);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del vuelo que quiere editar: ");
                    String nombreEditar = scanner.nextLine();
                    System.out.println("Ingrese el nuevo nombre del vuelo (o presione Enter para no cambiar): ");
                    String nuevoNombre = scanner.nextLine();
                    if (nuevoNombre.isEmpty()) nuevoNombre = null;
                    System.out.println("Ingrese el nuevo destino del vuelo (o presione Enter para no cambiar): ");
                    String nuevoDestino = scanner.nextLine();
                    if (nuevoDestino.isEmpty()) nuevoDestino = null;
                    System.out.println("Ingrese el nuevo horario del vuelo (o presione Enter para no cambiar): ");
                    String nuevoHorario = scanner.nextLine();
                    if (nuevoHorario.isEmpty()) nuevoHorario = null;
                    vuelosList.editarVuelo(nombreEditar, nuevoNombre, nuevoDestino, nuevoHorario);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del vuelo que quiere eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    vuelosList.eliminarVueloPorNombre(nombreEliminar);
                    break;

                case 4:
                    vuelosList.mostrarLista();
                    break;

                case 0:
                    System.out.println("Saliendo del menu");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuVuelos(scanner);
        scanner.close();
    }
}

