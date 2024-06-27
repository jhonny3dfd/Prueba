package Simple;
public class Nodo {
    public String dato;
    public Nodo siguiente; //puntero enlace
   
    //Constructor para instertar al final
    public Nodo(String d){
        this.dato =d;
        this.siguiente = null;
    }
    //Constructor para insertar al inicio
    public Nodo (String d, Nodo n){
        dato =d;
        siguiente = n;
    }


    public String getdato() {
        return dato;
    }
    public String getsiguiente() {
        return siguiente;
    }
    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public nodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
