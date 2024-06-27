package Simple;
public class Nodo {
    public int dato;
    public Nodo siguiente; //puntero enlace
   
    //Constructor para instertar al final
    public Nodo(int d){
        this.dato =d;
        this.siguiente = null;
    }
    //Constructor para insertar al inicio
    public Nodo (int d, Nodo n){
        dato =d;
        siguiente = n;
    }
}