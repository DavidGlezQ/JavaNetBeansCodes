package asignaciondememoria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AsignacionDeMemoria {
    /*La asignacion dinamica de memoria consiste en hacer que el programa pueda asignar memoria de las
    variables de manera dinamica, es decir que por medio de la clase ArrayList pueda almacenar una lista
    de numeros sin conocer cuantos seran, esto es muy bueno ya que se asigna la memoria exacta de
    y no se asigna de mas.*/

    public static void main(String[] args) {
        /*Declaracion de un ArrayList, en esta clase no hay nombres primitivos es decir que no se 
        puede poner int o double si no que se Integer o Double para poder declarar de que tipo sera 
        el ArrayList*/
        
        //Declarar un ArrayList
        ArrayList<Integer> listaNumerica = new ArrayList<>();
                
        int n=0, i=0;
        //Almacenamos los datos positivos en el ArrayList y deja de guardar datos cuando un numero es negativo.
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los nueros positivos: " + (i+1)));
            if(n>=0){
                i++;
                listaNumerica.add(n);
            }
           
        }while(n>=0);
        
        //Obtener el tamaño del ArrayList y su orden, lo imprime en consola.
        System.out.println("El ArrayList en orden es el siguiente:");
        //El metodo size nos sirve para saber solo el tamaño del ArrayList.
        for(i=0; i<listaNumerica.size(); i++){
            //El metodo get nos sirve para obtener los datos del ArrayList.
            System.out.println("Elemento: " + (i+1) + ": " + listaNumerica.get(i));
        }
        
        System.out.println("El tamaño del ArrayList es: " + listaNumerica.size());
        
        //Muestra en consola si el ArrayList esta vacio o tiene datos.
        //El metodo isEmpy nos sirve para saber si el ArrayList esta vacio.
        if(listaNumerica.isEmpty()){
            System.out.println("El ArrayList esta vacio");
        }else {
            System.out.println("El array list no esta vacio");
        }
    }
    
}
