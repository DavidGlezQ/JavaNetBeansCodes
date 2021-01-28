package arbolesbinariosdebusqueda_ejemplo1;

public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoizquierdo, hijoDerecho;

    public NodoArbol(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.hijoizquierdo = null;
        this.hijoDerecho = null;
    }

    @Override
    public String toString() {
        return nombre + " Su dato es: " + dato;
    }    
}
