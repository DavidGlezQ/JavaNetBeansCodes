package listaenlazadasimple_ejemplo2;

public class ListaEnlazada {
    
    Nodo cabeza; //La cabeza en una lista es el punto de partida parapoder recorrero la lista.
    int size; //Esta variable es para saber el tamaño de la lista.
            
    public ListaEnlazada(){
        cabeza = null;
    }
    
    public boolean esVacia(){ //Metodo para saber si la cabeza esta vacia.
        return(cabeza == null)?true:false; //Retorna el valor true o false para saber si esta vacia la lista.
    }
    
    public void addPrimero(Object obj){ //Este metodo es para añadir un valor al inicio de la cabeza.
        if(cabeza == null){ //Primero verificamos si la cabeza esta vacia, ya que si es asi añadiremos un nuevo nodo.
            cabeza = new Nodo(obj);
        } else {
            Nodo temporal = cabeza; //Creamos un nodo temporal.
            Nodo nuevo = new Nodo(obj); //Creamos un nuevo nodo, y este nodo esta aislado.
            nuevo.enlazarSiguiente(temporal); //Añadimos el nodo a la cabeza existente.
            cabeza = nuevo; //Declaramos que la nueva cabeza es la variable nuevo.
        }
        size++;
    }
    
    public int size(){ //Este metodo es para saber el tamaño de la lista.
        return size;
    }
    
    public Object obtener(int index){ //Este metodo es para obtener un valor especifico de la lista.
        int contador = 0; //Creamos un contador.
        Nodo temporal = cabeza; //Creamos un nodo temporal.
        while(contador<index){ //Sentencia while para obtener el tamaño de la cabeza o lista.
            temporal = temporal.getSiguiente(); //Vamos obteniendo cada valor de la cabeza
            contador++; //Incrementamos el contador
        }
        return temporal.getValor(); //Regresamos el valor.
    }
}
