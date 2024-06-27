package Simple;
public class ListaSimple {
    protected Nodo inicio,fin; //Punteros para saber donde esta el inicio y el fin
 
    public ListaSimple (){
        inicio = null;
        fin =null;
    }
 
    //Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicioS(int elemento){
        //Creando al nodo
        inicio = new Nodo(elemento,inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if (inicio == null){
            return true;
        }else{
            return false;
        }
    }
    //Metodo para instertar al final de la lista
    public void agregarAlFinalS(int elemento){
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin=fin.siguiente;
        }else{
            inicio =fin= new Nodo (elemento);
        }
    }
 
    //Metodo para eliminar al inicio de la lista
    public int eliminarInicioS(){
        int elemento = inicio.dato;
        if (inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
 
    //Metodo para eliminar al final de la lista
    public int EliminarFinalS(){
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        }else{
            Nodo temporal = inicio;
            while (temporal.siguiente!=fin) {
                temporal = temporal.siguiente;
            }
            fin=temporal;
            fin.siguiente = null;
        }
        return elemento;
    }
 
 
    //Metodo para mostrar los datos
    public void mostrarListaS(){
        Nodo recorrer = inicio;
        while (recorrer!= null) {
            System.out.print("["+ recorrer.dato +"]--->");
           
            recorrer = recorrer.siguiente;
        }
    }

    













}
 