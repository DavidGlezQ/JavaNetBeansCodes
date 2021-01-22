package listaenlazadadoble_ejemplo1;

public class ListaDoble {
    
    protected Nodo inicio;
    protected Nodo fin;
    
    public ListaDoble(){ //Se inicializan los punteros en null.
        inicio = null;
        fin = null;
    }
    
    public void addPrimero(String dato){ //Metodo para agregar un dato al inicio de la lista.
        if(inicio == null){ //Comprobamos si esta vacia.
            inicio = new Nodo(dato, null, null); //Recibe un dato y al estar vacia los punteros apuntan a null.
            fin = inicio; //Asignamos que el inicio de la lista ahora sera el final.
        } else {
            Nodo nuevo = new Nodo(dato, null, inicio); /*Al estar vacia la lista creamos un nuevo nodo
            pero apuntando el dato al inicio, el anterior a null.*/
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
    
    public void addFinal(String dato){ //Metodo para agregar un dato al fin de la lista.
        if(inicio == null){ //Comprobamos si esta vacia.
            fin = new Nodo(dato, null, null); //Recibe un dato y al estar vacia los punteros apuntan a null.
            inicio = fin;   
        } else {
            Nodo nuevo = new Nodo(dato, fin, null); /*Al estar vacia la lista creamos un nuevo nodo
            pero apuntando el dato al inicio, el anterior a null.*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public String getInicio(){ //Metodo para obtener el inicio de la lista
        String dato = inicio.getDato(); //Se obtiene el dato siguiente
        inicio = inicio.getSiguiente();
        if(inicio!=null){ //Comprobamos si es nulo ya que si lo es no es posible extraer nada.
            inicio.setAnterior(null); 
        } else {
            fin = null;
        }
        return dato;
    }
    
    public String getFin(){ //Metodo para obtener el inicio de la lista
        String dato = fin.getDato(); 
        fin = fin.getAnterior(); //Se obtiene el dato anterior
        if(fin!=null){ //Comprobamos si es nulo ya que si lo es no es posible extraer nada.
            fin.setSiguiente(null); 
        } else {
            inicio = null;
        }
        return dato;
    }
    
    public void mostrarInicio(){ //Metodo para  
        Nodo temp = inicio;
        while(temp!=null){ /*Sentencia while para saber si el inicio es nulo, si no lo es lo muestra 
            y pasa al siguiente nodo.*/
            System.out.println(temp.getDato());
            temp = temp.getSiguiente();
        }
    }
    
    public void mostrarFinal(){ //Metodo para  
        Nodo temp = fin;
        while(temp!=null){ /*Sentencia while para saber si el inicio es nulo, si no lo es lo muestra 
            y pasa al siguiente nodo.*/
            System.out.println(temp.getDato());
            temp = temp.getAnterior();
        }
    }
    
    public Boolean buscar(String dato){ //Metodo paara buscar un dato en la lista.
        Nodo temp = inicio;
        while(temp!=null){ //Recorremos la lista.
            if(temp.getDato().equals(dato)){
                return true;
            }
            temp = temp.getSiguiente();
        }
        return false;
    }
}
