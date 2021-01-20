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
    
    public void eliminarPrimero(){ /*Este metodo es para elminar el primer valor de la lista es decir
        la cabeza, la cabeza es el primer valor de la lista.*/
        cabeza = cabeza.getSiguiente(); //Obtenemos el valor siguiente de la lista y lo reducimos.
        size--;
    }
    
    public void eliminar(int index){
        /*1 -> 2 -> 3 -> 4 -> 5
        1 -> 2 -> 4
        1 -> 2 -> 4 -> 5*/
        if(cabeza == null){ //Comprobamos si la cabeza de la lista es nula.
            cabeza = cabeza.getSiguiente();
        } else {
        int contador = 0; //Se crea un contador.
        Nodo temporal = cabeza; //Creamos un nodo temporal que sea igual a la cabeza.
        while(contador<index-1){ //Sentencia while para poder eliminar.
            temporal = temporal.getSiguiente(); //Obtenemos el valor siguiente
            contador++;
        }
        temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
        }
        size--; //Disminuimos el valor en -1
    }
    
    public void cortar(int index){ //Metodo para cortar la lista
        //1 -> 2 -> 3 depues del nodo 3 se borra lo demas.
        int contador = 0; //Se crea un contador.
        Nodo temporal = cabeza; //Creamos un nodo temporal que sea igual a la cabeza.
        while(contador<index-1){ //Sentencia while para poder eliminar.
            temporal = temporal.getSiguiente(); //Obtenemos el valor siguiente
            contador++;
        }
        temporal.enlazarSiguiente(null); //Encuentra el nodo indicado y de ahi en adelante lo borrao corta.
        size = index;
    }
}
