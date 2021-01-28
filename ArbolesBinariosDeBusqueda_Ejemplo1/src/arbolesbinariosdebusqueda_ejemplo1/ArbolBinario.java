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
    
    //Metodo para recorrero el arbol en orden.
    public void inOrden(NodoArbol ra){
        if(ra!=null){
            inOrden(ra.hijoizquierdo);
            System.out.println(ra.dato);
            inOrden(ra.hijoDerecho);
        }
    }
    
    //Metodo para saber si el arbol esta vacio.
    public boolean estaVacio(){
        return raiz == null;
    }
    
    //Metodo para recorrer el arbol en preorden
    public void preOrden(NodoArbol ra){
       if(ra!=null){
           System.out.println(ra.dato);
           preOrden(ra.hijoizquierdo);
           preOrden(ra.hijoDerecho);
        } 
    }
}
