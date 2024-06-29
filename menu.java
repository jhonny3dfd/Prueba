import java.util.*;

import Simple.ListaSimple;


public class menu {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{System.out.println("-------Menu--------");
           System.out.println("1. Acceso a Vuelos");
           System.out.println("2. Acceso a Pasajeros");
           System.out.println("3. Acceso a Abordaje");
           System.out.println("4. Finalizar programa");
           opcion = scanner.nextInt();


           switch (opcion){
            case 1:
                ListaSimple.menuVuelos(scanner);
                break;
            
            case 2:
            //(scanner);
            break;

            case 3:
            //(scanner);
            break;

            case 4:
            System.out.println("programa finalizado....");
            break;
           }
        }while (opcion !=4); {
        scanner.close();
        }

    }
}