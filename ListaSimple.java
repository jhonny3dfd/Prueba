package Simple;
import java.util.Scanner;
public class ListaSimple {
    protected Nodo inicio,fin; //Punteros para saber donde esta el inicio y el fin
 
    public ListaSimple (){
        inicio = null;
        fin =null;
    }
 
    //Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicioS(String elemento){
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
    public void agregarAlFinalS(String elemento){
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin=fin.siguiente;
        }else{
            inicio =fin= new Nodo (elemento);
        }
    }
 
    //Metodo para eliminar al inicio de la lista
    public String eliminarInicioS(){
        String elemento = inicio.dato;
        if (inicio==fin) {
            inicio=null;
            fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return elemento;
    }
 
    //Metodo para eliminar al final de la lista
    public String EliminarFinalS(){
        String elemento = fin.dato;
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

    public void editarLibro(String dato, String nuevoVuelo) {
        if ((nuevoVuelo != null && inicio.estaVacia(nuevoVuelo)) ){
            System.out.println("No se puede editar el libro porque la nueva categoría o el nuevo autor no existen.");
        }
        else {
            Nodo actual = inicio;
            boolean encontrado = false;

            while (actual != null) {
                if (actual.getTitulo().equalsIgnoreCase(titulo)) {
                    if (nuevoTitulo != null) actual.setTitulo(nuevoTitulo);
                    if (nuevoAutor != null) actual.setAutor(nuevoAutor);
                    if (nuevaCategoria != null) actual.setCategoria(nuevaCategoria);;
                    encontrado = true;
                    break;
                }
                actual = actual.getSiguiente();
            }

            if (encontrado) {
                System.out.println("Libro editado exitosamente.");
            } else {
                System.out.println("Libro no encontrado.");
            }
        }
    }
 
 
    //Metodo para mostrar los datos
    public void mostrarListaS(){
        Nodo recorrer = inicio;
        while (recorrer!= null) {
            System.out.print("["+ recorrer.dato +"]--->");
           
            recorrer = recorrer.siguiente;
        }
    }

    private static void menuVuelos(Scanner scanner){
        ListaSimple VuelosList = new ListaSimple(); 
        int opcion;
        String agrega;
        do{
            System.out.println("Menu categorias" );
            System.out.println("1. Crear Vuelo ");
            System.out.println("2. Editar Vuelo ");
            System.out.println("3. Eliminar Vuelo ");
            System.out.println("Mostrar Lista de Vuelos");
            System.out.println("Seleccione una de las opciones ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                System.out.println("Ingrese el nombre del nuevo vuelo ");
                agrega = scanner.nextLine();
                VuelosList.agregarAlFinalS( agrega);
                break;

                case 2:
                System.out.println("Ingrese el nombre del vuelo que quiere editar");
                String nombreEditar = scanner.nextLine();
                VuelosList.
            }
        }

    }














}
 
 
