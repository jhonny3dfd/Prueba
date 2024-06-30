import java.util.*;
import Simple.*;
import Doble.*;


public class menu {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListaSimple listaVuelos = new ListaSimple();
        int opcion;
        do{System.out.println("-------Menu--------");
           System.out.println("1. Acceso a Vuelos");
           System.out.println("2. Acceso a Pasajeros");
           System.out.println("3. Acceso a Abordaje");
           System.out.println("4. Finalizar programa");
           opcion = scanner.nextInt();


           switch (opcion){
            case 1:
                ListaSimple.menuVuelos(scanner, listaVuelos);
                break;
            
            case 2:
                Pasajeros.menuPasajeros(scanner);
                break;

            case 3:
                System.out.println("Ingrese el nombre del vuelo: ");
                String nombre = scanner.nextLine();

                ListaSimple nodo = new ListaSimple();
                Vuelo vuelo = nodo.Buscar(nombre);

                vuelo.Abordaje();

                break;

            case 4:
            System.out.println("programa finalizado....");
            break;
           }
        }while (opcion !=4); {
        }

    }
}
