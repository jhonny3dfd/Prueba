package Doble;
 
public class NodoDoble {
    public int dato;
    NodoDoble siguiente,anterior;

    //Contructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el,null,null);
    }
   
    //Contructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s,NodoDoble a){
        dato = el;
        siguiente=s;
        anterior=a;
    }
}