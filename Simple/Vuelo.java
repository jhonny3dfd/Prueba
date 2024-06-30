package Simple;
import Doble.*;
import Cola.*;
public class Vuelo {

    private String destino, horario, nombre;
    private int capacidad, numpasajeros;
    private Pasajero[] pasajeros;

    public Vuelo(String destino, String horario, String nombre, int capacidad) {
        this.destino = destino;
        this.horario = horario;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.numpasajeros = 0;
        this.pasajeros = new Pasajero[capacidad];
    }

    public String getDestino() {
        return destino;
    }

    public String getHorario() {
        return horario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public int getNumpasajeros() {
        return numpasajeros;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setNumpasajeros(int numpasajeros) {
        this.numpasajeros = numpasajeros;
    }

    public boolean EstaLleno() {
        return numpasajeros >= capacidad;
    }
    public boolean ContienePasajero(String id) {
        for (int i = 0; i < numpasajeros; i++) {
            if (pasajeros[i] != null && pasajeros[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public void AsociarPasajero(Pasajero pasajero) {
        if (EstaLleno()) {
            System.out.println("El vuelo esta lleno");
            return;
        }
        if (ContienePasajero(pasajero.getId())) {
            System.out.println("El pasajero con ID " + pasajero.getId() + " ya está asociado a este vuelo.");
        } else {
            pasajeros[numpasajeros] = pasajero;
            numpasajeros++; 
            System.out.println("Pasajero asociado con éxito.");
        }
    }

    public String Mostrar() {
        return "Destino: " + destino + ", Horario: " + horario + ", Nombre: " + nombre + ", Capacidad: " + capacidad + "\n";
    }

    public void imprimirListaPasajeros() {
        System.out.println("Información del Vuelo:");
        System.out.println("Destino: " + destino);
        System.out.println("Horario: " + horario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Número de Pasajeros: " + numpasajeros);
        System.out.println("Lista de Pasajeros:");
        for (int i = 0; i < numpasajeros; i++) {
            System.out.println(pasajeros[i].toString());
        }
    }

    public void Abordaje() {
        Abordaje cola = new Abordaje();

        if (!EstaLleno()) {
            System.out.println("El vuelo no esta lleno");
            return; 
        }
        // Primero los asientos PAR
        for (int i = 0; i < capacidad; i++) {
            Pasajero infopasajero = pasajeros[i];
            if (infopasajero != null) {
                String asiento = infopasajero.getAsiento();
                int numero = Integer.parseInt(asiento); 
                if (numero % 2 == 0) {
                    cola.agregarPasajero(infopasajero);
                }
            }
        }

        // Ahora los asientos IMPAR
        for (int i = 0; i < capacidad; i++) {
            Pasajero infopasajero = pasajeros[i];
            if (infopasajero != null) {
                String asiento = infopasajero.getAsiento();
                int numero = Integer.parseInt(asiento); 
                if (numero % 2 != 0) {
                    cola.agregarPasajero(infopasajero);
                }
            }
        }

        System.out.println("Pasajeros en la cola de abordaje:");
        cola.mostrarPasajero();
    }
}
