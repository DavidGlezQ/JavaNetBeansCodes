package arbolesbinariosdebusqueda_ejemplo1;

public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    //Metodo para insertra un nodo en el arbol.
    public void agregarNodo(int dato, String nom){
        NodoArbol nuevo = new NodoArbol(dato, nom);
        if(raiz == null){
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while(true){
                padre = auxiliar;
                if(dato<auxiliar.dato){
                    auxiliar = auxiliar.hijoizquierdo;
                    if(auxiliar == null){
                        padre.hijoizquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
}
