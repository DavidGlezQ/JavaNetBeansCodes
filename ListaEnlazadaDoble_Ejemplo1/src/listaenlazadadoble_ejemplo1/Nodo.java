package listaenlazadadoble_ejemplo1;

public class Nodo {
    
    protected Nodo siguiente;
    protected Nodo anterior;
    protected String dato;

    public Nodo(String dato, Nodo anterior, Nodo siguiente) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
    
}
