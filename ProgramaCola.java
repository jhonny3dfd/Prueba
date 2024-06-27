package Colas;
import java.util.*;
public class ProgramaCola {
    public static void ProgramaC(){
 
        Queue<Integer> cola = new LinkedList<>();
        Scanner scanner = new Scanner (System.in);
       
        int opcion;
        do {
            System.out.println("----Menú----");
            System.out.println("1. Encolar un elemento");
            System.out.println("2. Desencolar un elemento");
            System.out.println("3. Mostrar cola de frente");
            System.out.println("4. Tamanio de la cola");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
   
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el elemento a encolar:");
                    int elemento = scanner.nextInt();
                    cola.offer(elemento);
                    System.out.println("Elemento encolado:" + elemento);
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        int desencolado = cola.poll();
                        System.out.println("Elemento desencolado:" + desencolado);
                    }else{
                        System.out.println("Cola vacia");
                    }
                    break;
                case 3:
                    if (!cola.isEmpty()) {
                        int frente = cola.peek();
                        System.out.println("Elemento de frente:" + frente);
                    }else{
                        System.out.println("Cola vacia, no hay frente");
                    }
                    break;
                case 4:
                    System.out.println("Tamanio de la cola:" + cola.size());
                    break;
                case 5:
                    System.out.println("Finalizado!!");
                    break;
               
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 5);
          scanner.close();
    }
}
 
