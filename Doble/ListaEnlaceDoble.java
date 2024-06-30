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

    public void InsertaPasajero(Pasajero pasajero){
        NodoListaDoble n = new NodoListaDoble(pasajero);//crea el nodo apuntado por el puntero n
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

    public void imprimirListaInicioFin() {
        //se crea un puntero recorre, que se apunta al nodo inicio quien apunta al inicio de la lista
        NodoListaDoble recorre = inicio;
        //recorre la lista hasta que recorre este al final de la lista, en cada paso muestra la información
        while (recorre != null) {
            System.out.print(recorre.getPasajero() + " ");
            recorre = recorre.getSiguiente();
        }
        System.out.println();
    }

    public NodoListaDoble Buscar(String id) {
        NodoListaDoble actual = inicio; //nodo que contiene el objeto
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            if (actual.getPasajero().getId().equals(id)) {
                return actual; //devuelve el nodo si encuentra el id
            }
            actual = actual.getSiguiente();
        }
        return null; //devuelve null si no esta
    }
    // :O
    public void EliminarPasajero(String id) {
        NodoListaDoble actual = inicio;
        boolean encontrado = false;
        while (actual != null && !encontrado) {
            if (actual.getPasajero().getId().equals(id)) {//Compara si el get id del pasajero ya guardado anteriormente es igual al id entregado por el usuario
                encontrado = true;
                if (actual.getAnterior() != null) {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                } else {
                    inicio = actual.getSiguiente();
                }
                if (actual.getSiguiente() != null) {
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                } else {
                    fin = actual.getAnterior();
                }
            } else {
                actual = actual.getSiguiente();
            }
        }
        if (encontrado) {
            System.out.println("El pasajero de id: " + id + " ha sido eliminado");
        } else {
            System.out.println("El id: " + id + " no se encontro");
        }
    }
}
