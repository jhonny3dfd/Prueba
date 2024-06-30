package Simple;

public class Nodo {

    private Vuelo vuelo;
    private Nodo siguiente;

    public Nodo(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.siguiente = null;
    }

    //Getters and Setters
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
