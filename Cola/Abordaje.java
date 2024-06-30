package Cola;
import Doble.Pasajero;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import Simple.Nodo;

public class Abordaje {

    private final LinkedList<Pasajero> cola = new LinkedList<>();

    public void agregarPasajero(Pasajero pasajero) {
        cola.addLast(pasajero); //AddLast para añadir pasajero al final de la cola
    }

    public void mostrarPasajero() {
        for (Pasajero pasajero : cola) {
            System.out.println("Pasajero: " + pasajero.toString());
        }
    }

    public void abordarPasajero() {
        if (cola.isEmpty()) {
            System.out.println("No hay pasajeros en la cola");
        } else {
            Pasajero pasajero = cola.poll(); //Poll para sacar el primer pasajero de la cola
            System.out.println("Pasajero abordado: " + pasajero.toString());
        }
    }
}
