package abstractfactory_ejemplo_2;

import AplicacionDiseño.DiseñoSuperMarioBros3;
import ClasesFactory.NewSuperMarioBrosUFactory;
import ClasesFactory.SuperMarioBros3Factory;
import ClasesFactory.SuperMarioBrosFactory;
import ClasesFactory.SuperMarioWorldFactory;
import Interfaces.InterfaceFactory.objetosDiseño;
import Interfaces.ServicioFactory;
import java.util.Scanner;

public class AbstractFactory_Ejemplo_2 {
    //Variables
    private static Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
        //Cuerpo
        int opcion;
        do{
            opcion = preguntarServicio();
            switch(opcion){
                case 1:
                    usarDiseño(new SuperMarioBrosFactory());
                    break;
                case 2:
                    usarDiseño(new SuperMarioBros3Factory());
                    break;
                case 3:
                    usarDiseño(new NewSuperMarioBrosUFactory());
                    break;
                case 4:
                    usarDiseño(new SuperMarioWorldFactory());
                    break;
                default:
                    System.out.println("Saliendo...");
            }
        }while(opcion!=5);
    }  
    
    //Metodos
    public static void usarDiseño(ServicioFactory factory){
        objetosDiseño servicio = factory.crearServicio();
        servicio.moneda();
        servicio.enemigo();
        servicio.personaje();
        servicio.toad();
    }
    
    public static int preguntarServicio(){
        System.out.println("ELIJE EL DISEÑO DEL NIVEL\n"
                + "1.-Diseño Super Mario Bros\n"
                + "2.-Diseño Super Mario Bros 3\n"
                + "3.-Diseño Super Mario Bros U\n"
                + "4.-Diseño Super Mario World\n"
                + "5.-Cerrar juego\n"
                + "Opcion: ");
        return Integer.parseInt(S.nextLine());
    }   
}
