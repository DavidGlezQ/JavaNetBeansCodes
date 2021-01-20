package listaenlazadasimple_ejemplo2;

public class Nodo {
    Object valor; //La variable Object sera la que guarde el valor.
    Nodo siguiente; //Este es un puntero el cual hace el enlace.

    public Nodo(Object valor) { //Este es el constructor el cual tiene como parametro Object valor.
        this.valor = valor;
        this.siguiente = null; /*Este valor se inicializa en null para que cuando se 
        regrese un valor null significa que ya no hay un valor siguiente en la lista.*/
    }
    
    public void enlazarSiguiente(Nodo n){ //Este metodo que nos sirve para enlazar los nodos.
        siguiente = n; //De esta manera podemos enlazar el nodo siguiente.
    }
    
    public Nodo getSiguiente(){ //Este metodo nos sirve para obtener el valor siguiente.
        return siguiente; //Reguresa el enlace al siguiente nodo.
    }
    
    public Object getValor(){ //Este metodo nos sirve para obtener el valor de la lista.
        return valor; //Regrea el valor al nodo que este asignado.
    }
}
