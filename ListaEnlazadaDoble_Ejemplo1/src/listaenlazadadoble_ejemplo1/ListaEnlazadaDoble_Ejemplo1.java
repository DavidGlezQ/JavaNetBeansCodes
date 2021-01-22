package listaenlazadadoble_ejemplo1;

public class ListaEnlazadaDoble_Ejemplo1 {
    
    public static void main(String[] args) {  
        ListaDoble listD = new ListaDoble();
        //Agregamos nodos a la lista.
        listD.addPrimero("A");
        listD.addFinal("B");
        listD.addFinal("C");
        listD.addFinal("D");
        //Mostramos los nodos de inicio a fin de la lista.
        System.out.println("Mostrando la lista desde el INICIO hasta el FINAL");
        listD.mostrarInicio();
        //Mostramos los nodos de fin a inicio de la lista.
        System.out.println("Mostrando la lista desde el FINAL hasta el INICIO");
        listD.mostrarFinal();
        
        //Eliminar el inicio de la lista.
        System.out.println("Nodo inicial eliminado: " + listD.getInicio());
        System.out.println("La lista actual es: ");
        listD.mostrarInicio();
        
        //Eliminar el fin de la lista.
        System.out.println("Nodo final eliminado: " + listD.getFin());
        System.out.println("La lista actual es: ");
        listD.mostrarInicio();
        
        //Buscar un nodo
        System.out.println(listD.buscar("A"));
        System.out.println(listD.buscar("B"));
        System.out.println(listD.buscar("C"));
        System.out.println(listD.buscar("D"));
    }
}
