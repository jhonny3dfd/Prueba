package Simple;

public class Nodo {
    private String nombre;
    private String destino;
    private String horario;
    public Nodo siguiente;

    public Nodo(String nombre, String destino, String horario) {
        this.nombre = nombre;
        this.destino = destino;
        this.horario = horario;
        this.siguiente = null;
    }

    public Nodo(String nombre, String destino, String horario, Nodo n) {
        this.nombre = nombre;
        this.destino = destino;
        this.horario = horario;
        this.siguiente = n;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public String getHorario() {
        return horario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
