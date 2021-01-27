package arbolesbinariosdebusqueda_ejemplo1;

import javax.swing.JOptionPane;

public class ArbolesBinariosDeBusqueda_Ejemplo1 {

    public static void main(String[] args) {
        int opc = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            try {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.- Agregar un Nodo\n"
                                + "2.- Recorrer el arbol en orden\n"
                                + "3.- Salir\n" 
                                + "Elije una opcion", JOptionPane.QUESTION_MESSAGE));
                switch(opc){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el numero del nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, 
                                "Ingresa el nombre del nodo", JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:   
                        if(!arbolito.estaVacio()){
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break; 
                    case 3:   
                        JOptionPane.showMessageDialog(null, "Aplicacion terminada", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        break;     
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "",
                                JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
        } while(opc!=3);
    }
    
}
