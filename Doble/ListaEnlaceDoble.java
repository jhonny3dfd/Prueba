package Doble;
public class ListaEnlaceDoble {
    NodoListaDoble inicio;//crea el puntero que apunta al inicio de la lista
    NodoListaDoble fin;//crea el puntero que apunta al fin lista

    public ListaEnlaceDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public int CuentaElementos(){
        int acc = 0;
        NodoListaDoble recorre = inicio;
        while (recorre != null) {
            acc += 1;
            recorre = recorre.getSiguiente();
        }
        return acc;
    }

    public void InsertaInicio(int dato){
        NodoListaDoble n = new NodoListaDoble(dato);//crea el nodo apuntado por el puntero n
        if (inicio == null) {
            //si el puntero inicio apunta a null, lista vacia
            inicio = n;//apunta inicio a n
            fin = n;//apunta fin a n
        }
        else {
            n.setSiguiente(inicio);//apunta el enlace siguiente del nodo apuntado por n al puntero inicio
            inicio.setAnterior(n);//apunta el enlase anterior del nodo apuntado por inicio a n
            inicio = n; //inicio se apunta a n
        }
    }

    public void InsertaFin(int dato){
        NodoListaDoble n = new NodoListaDoble(dato);//crea el nodo apuntado por el puntero n
        if (inicio == null) {
            //si el puntero inicio apunta a null, lista vacia
            inicio = n;//apunta inicio a n
            fin = n;//apunta fin a n
        }
        else {
            fin.setSiguiente(n);
            n.setAnterior(fin);
            fin = n;
        }
    }

    public void insertaPosicion(int dato, int pos){
        int pos_actual = 0;
        if (pos > CuentaElementos()){//si la posicion es mayor que la cantidad de lementos retorna mensaje
            System.out.println("La posicion no existe en la lista");
        }
        else{
            if (pos == 0){
                InsertaInicio(dato);
            }
            else{
                NodoListaDoble n = new NodoListaDoble(dato);//crea el nodo apuntado por el puntero n
                NodoListaDoble recorre = inicio;
                while ((recorre.getSiguiente() != null) && (pos_actual < pos-1)){
                    pos_actual++;
                    recorre = recorre.getSiguiente();
                }
                //agrega el al final, es decir se pasa la posición final
                if(recorre.getSiguiente() == null){
                    recorre.setSiguiente(n);
                    n.setAnterior(recorre);
                    fin = n;
                }
                else{
                    NodoListaDoble aux = recorre.getSiguiente();
                    n.setSiguiente(recorre.getSiguiente());
                    recorre.setSiguiente(n);
                    n.setAnterior(recorre);
                    n.setSiguiente(aux);
                    aux.setAnterior(n);
                }
            }
        }
    }


    public void imprimirListaInicioFin() {
        //se crea un puntero recorre, que se apunta al nodo inicio quien apunta al inicio de la lista
        NodoListaDoble recorre = inicio;
        //recorre la lista hasta que recorre este al final de la lista, en cada paso muestra la información
        while (recorre != null) {
            System.out.print(recorre.getDato() + " ");
            recorre = recorre.getSiguiente();
        }
        System.out.println();
    }
}
