package listaenlazadasimple_ejemplo2;

public class ListaEnlazadaSimple_Ejemplo2 {
   
    public static void main(String[] args) {
        Nodo primer = new Nodo("Lista"); //Agregamos un primer valor a la lista.
        Nodo segundo = new Nodo(21); //Agregamos un segundo valor a la lista.
        Nodo tercer = new Nodo("Hola Mundo"); //Agregamos un tercer valor a la lista.
        
        primer.enlazarSiguiente(segundo); //De esta manera enlazamos el primer nodo con el segundo nodo.
        primer.getSiguiente().enlazarSiguiente(tercer); //Asi se enlazan los tres nodos.
        
        /*Al momento de imprimir el valor recorreo la lista hasta la tercera posicion ya que obtenemos
        los dos primeros valores de la llsta, si borramos un getSiguiente se obtiene el anterior*/
        //System.out.println(primer.getSiguiente().getSiguiente().getValor().toString());
        
        ListaEnlazada lista = new ListaEnlazada(); //Creamos un objeto de la clase listaEnlazada.
        
        System.out.println("Esta vacia la lista? " + lista.esVacia());
        
        lista.addPrimero("David"); //Agregamos valores a la lista, cabeza.
        lista.addPrimero(21);
        lista.addPrimero("Desarrollador de software");
        lista.addPrimero(10);
        
        System.out.println("Primer elemento: " + lista.obtener(0));
        System.out.println("Ultimo elemento: " + lista.obtener(lista.size()-1));
        System.out.println("Index 2: " + lista.obtener(2));
        System.out.println("Esta vacia la lista? " + lista.esVacia());
        System.out.println("Tamaño de la lista: " + lista.size());
        
    }
    
}
