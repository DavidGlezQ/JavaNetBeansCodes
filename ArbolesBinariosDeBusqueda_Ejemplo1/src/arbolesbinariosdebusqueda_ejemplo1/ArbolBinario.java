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
    
    //Metodo para saber si el arbol esta vacio.
    public boolean estaVacio(){
        return raiz == null;
    }
    
    //ARBOL: 8 3 10 14 13 1 6 4 7
    //METODOS PARA RECORRER UN ARBOL BINARIO DE DIFERENTES MANERAS. 
    //Metodo para recorrero el arbol en orden.
    public void inOrden(NodoArbol ra){
        if(ra!=null){
            inOrden(ra.hijoizquierdo); //Nodo izquierdo
            System.out.print(ra.dato + ", "); //Raiz
            inOrden(ra.hijoDerecho); //Nodo derecho.
        }
    }
  
    //Metodo para recorrer el arbol en preorden
    public void preOrden(NodoArbol ra){
       if(ra!=null){
           System.out.print(ra.dato + ", ");
           preOrden(ra.hijoizquierdo);
           preOrden(ra.hijoDerecho);
        } 
    }
    
    //Metodo para recorrero el arbol en post orden
    public void postOrden(NodoArbol ra){
        if(ra!=null){
           postOrden(ra.hijoizquierdo);
           postOrden(ra.hijoDerecho);
           System.out.print(ra.dato + ", ");
        } 
    }
    
    //Metodo para buscar un nodo en el arbol
    public NodoArbol buscarNodo(int dat){
        NodoArbol aux = raiz;
        while(aux.dato!=dat){
            if(dat<aux.dato){
                aux = aux.hijoizquierdo;
            } else {
                aux = aux.hijoDerecho;
            }
            if(aux==null){
                return null;
            }
        }
        return aux;
    }
    
    //Metodo para eliminar un nodo del arbol
    public boolean eliminarNodo(int dat){
        NodoArbol aux = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzq = true;
        while(aux.dato!=dat){
            padre = aux;
            if(dat<aux.dato){
                esHijoIzq = true;
                aux = aux.hijoizquierdo;
            } else {
                esHijoIzq = false;
                aux = aux.hijoDerecho;
            }
            if(aux == null){
                return false;
            }
        }
        if(aux.hijoizquierdo == null && aux.hijoDerecho == null){
            if(aux == raiz){
                raiz = null;
            } else if(esHijoIzq){
                padre.hijoizquierdo = null;
            } else {
                padre.hijoDerecho = null;
            }
        }else if(aux.hijoDerecho == null){
            if(aux == raiz){
                raiz = aux.hijoizquierdo;
            } else if(esHijoIzq){
                padre.hijoizquierdo = aux.hijoizquierdo;
            } else {
                padre.hijoDerecho = aux.hijoizquierdo;
            }
        } else if(aux.hijoizquierdo == null){
            if(aux == raiz){
                raiz = aux.hijoDerecho;
            } else if(esHijoIzq){
                padre.hijoizquierdo = aux.hijoDerecho;
            } else {
                padre.hijoDerecho = aux.hijoizquierdo;
            }
        } else {
            NodoArbol remplazo = getNodoReemplazo(aux);
            if(aux == raiz){
                raiz = remplazo;
            } else if(esHijoIzq){
                padre.hijoizquierdo = remplazo;
            } else {
                padre.hijoDerecho = remplazo;
            }
            remplazo.hijoizquierdo = aux.hijoizquierdo;
        }
        return true;
    }
    
    //Metodo para devolver el nodo remplazo.
    public NodoArbol getNodoReemplazo(NodoArbol nodoReemp){
        NodoArbol reemplazoPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol aux = nodoReemp.hijoDerecho;
        while(aux!=null){
            reemplazoPadre = reemplazo;
            reemplazo = aux;
            aux = aux.hijoizquierdo;
        }
        if(reemplazo!=nodoReemp.hijoDerecho){
            reemplazoPadre.hijoizquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es: " + reemplazo);
        return reemplazo;
    }
}
