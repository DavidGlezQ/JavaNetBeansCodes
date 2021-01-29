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
                                + "3.- Recorrer el arbol en pre orden\n"
                                + "4.- Recorrer el arbol en post orden\n"
                                + "5.- Buscar un nodo en el arbol\n"
                                + "6.- Eliminar un nodo en el arbol\n"
                                + "7.- Salir\n" 
                                + "Elije una opcion", JOptionPane.QUESTION_MESSAGE));
                switch(opc){
                    //Opcion para insertar nodos en el arbol.
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el numero del nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, 
                                "Ingresa el nombre del nodo", JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    //Opcion para mostrar el arbol en orden normal.   
                    case 2:   
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.inOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    //Opcion para mostrar el arbol en pre orden.    
                    case 3:   
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.preOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }    
                        break; 
                    //Opcion para mostrar el arbol en post orden.    
                    case 4:   
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.postOrden(arbolito.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }    
                        break; 
                    //opcion para buscar un nodo en el arbol.    
                    case 5:   
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el numero del nodo que desea buscar", 
                                JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.buscarNodo(elemento) == null){
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("Nodo encontrado: " + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }    
                        break;    
                    //opcion para eliminar un nodo en el arbol.    
                    case 6:   
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingresa el numero del nodo que desea eliminar", 
                                JOptionPane.QUESTION_MESSAGE));
                            if(arbolito.eliminarNodo(elemento)== false){
                                System.out.println("Nodo no encontrado");
                            } else {
                                System.out.println("El nodo ha sido eliminado del arbol");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }    
                        break;        
                    //Opcion para terminar la aplicacion
                    case 7:   
                        JOptionPane.showMessageDialog(null, "Aplicacion terminada", "", 
                                JOptionPane.INFORMATION_MESSAGE);
                        break;     
                    //Opcion default.    
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "",
                                JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
            }
        } while(opc!=7);
    }
    /*De la vista nace el conocimiento y de la practica hace el maestro*/
}
