package Doble;

public class NodoListaDoble {
    private Pasajero dato;
    private NodoListaDoble siguiente;
    private NodoListaDoble anterior;

    public NodoListaDoble(Pasajero dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Pasajero getPasajero() {
        return dato;
    }

    public void setDato(Pasajero dato) {
        this.dato = dato;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

}
