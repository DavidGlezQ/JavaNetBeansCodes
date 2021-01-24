package listaenlazadacircular_ejemplo1;

public class Nodo {
    //Variable para guardar los datos y el puntero para crear los nodos.
    protected int dato;
    protected Nodo siguiente;

    //Constructor.
    public Nodo() {
        this.dato = 0;
        this.siguiente = null;
    }

    //Metodos getter y setter.
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
