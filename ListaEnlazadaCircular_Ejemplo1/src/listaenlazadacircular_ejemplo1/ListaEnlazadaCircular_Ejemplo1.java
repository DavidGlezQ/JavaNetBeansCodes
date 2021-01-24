package listaenlazadacircular_ejemplo1;

public class ListaEnlazadaCircular_Ejemplo1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Ejemplo de una lista enlazada circular");
        ListaCircular listCir = new ListaCircular();
        //Agregamos valores al final.
        listCir.agregarAlFinal(12);
        listCir.agregarAlFinal(15);
        listCir.agregarAlFinal(9);
        
        //Agregamos valores al inicio.
        listCir.agregarAlInicio(41);
        listCir.agregarAlInicio(6);
        
        //Mostramos la lista.
        System.out.println("La ista circular actual es: "); 
        listCir.listar();
        
        //Tamaño de la lista.
        System.out.println("El tamaño de la lista circular es: " + listCir.getTamaño()); 
        
        //Obtener un valor especificado de la lista.
        System.out.println("El valor obtenido del nodo: " + listCir.getValor(2)); 
        
        //Insertar valor por medio de una posicion.
        System.out.println("Insertar un valor por posicion");
        listCir.insertarPorPosicion(5, 45);
        listCir.listar();
        System.out.println("Tamaño actualizado: " + listCir.getTamaño());
        
        //Actualiza un valor de un nodo espcificado.
        System.out.println("Actualiza el valor del nodo");
        listCir.editarPorReferencia(12, 13);
        listCir.listar();
        System.out.println("Tamaño actualizado: " + listCir.getTamaño());
        
        //Actualiza el valor de un nodo especificado
        System.out.println("Actualiza el valor nodo indicado");
        listCir.editarPorPosicion(2, 18);
        listCir.listar();
        System.out.println("Tamaño actualizado: " + listCir.getTamaño());
        
        //Eliminar un nodo por referencia (valor del nodo), solo en orden.
        System.out.println("Elimina el nodo con el valor especificado");
        listCir.removerPorReferencia(6);      
        listCir.removerPorReferencia(18);  
        listCir.listar();
        System.out.println("Tamaño actualizado: " + listCir.getTamaño());      
        
        //Eliminar la lista.
        System.out.println("\nElimina la lista");
        listCir.eliminar();
      
        //Consultar si la lista esta vacia.
        System.out.println("Consulta si la lista está vacia");
        System.out.println(listCir.isEmpy());
    }
    
}
