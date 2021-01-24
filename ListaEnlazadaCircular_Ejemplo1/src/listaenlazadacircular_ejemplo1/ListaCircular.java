package listaenlazadacircular_ejemplo1;

public class ListaCircular {
    
    private Nodo inicio;
    private Nodo ultimo;
    private int tamaño;
    
    public void Lista(){ //Constructor por defecto.
        inicio = null; //los punteros apuntando a null
        ultimo = null;
        tamaño = 0; //El tamaño inicia en 0.
    }
    
    public boolean isEmpy(){ //Metodo para saber si la lista esta vacia.
        return  inicio == null;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
    public void agregarAlFinal(int valor){ //Metodo para agregar un nuevo nodo al final de la lista.
        Nodo nuevo = new Nodo(); //Creamos un nuevo nodo.
        nuevo.setDato(valor); //Agregamos un valor al nodo
        if(isEmpy()){ //Comprobamos si la lista esta vacia.
            inicio = nuevo; //Inicializa la lista agregando como inicio al nuevo nodo.
            ultimo = nuevo; //De igual forma el ultimo nodo sera el nuevo.
            ultimo.setSiguiente(inicio); //Y el puntero del ultimo debe apuntar al primero.
        } else {
            ultimo.setSiguiente(nuevo); //Apuntamos con el ultimo nodo de la lista al nuevo.
            nuevo.setSiguiente(inicio); //Apuntamos con el nuevo nodo al inicio de la lista.
            ultimo = nuevo; //Como el nuevo nodo es el ultimo se actualiza.
        }
        tamaño++;
    }
    
    public void agregarAlInicio(int valor){ //Metodo para agregar un nodo al final de la lista.
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        if(isEmpy()){
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamaño++;
    }
    
    public void insertarPorReferencia(int referencia, int valor){ //Metodo para insertar por referencia de un nodo.
        Nodo nuevo = new Nodo();
        nuevo.setDato(valor);
        if(!isEmpy()){
            if(buscar(referencia)){
                Nodo aux = inicio;
                while(aux.getDato()!=referencia){
                    aux = aux.getSiguiente();
                }
                if(aux == ultimo){
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;
                } else {
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                tamaño++;
            }
        } 
    }
    
    public void insertarPorPosicion(int posicion, int valor){
        if(posicion>=0 && posicion<=tamaño){
            Nodo nuevo = new Nodo();
            nuevo.setDato(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                ultimo.setSiguiente(inicio);
            } else {
                if(posicion == tamaño){
                    ultimo.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;
                } else {
                    Nodo aux = inicio;
                    for(int i = 0; i<posicion-1; i++){
                        aux = aux.getSiguiente();
                    }
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamaño++;
        }
    }
    
    public int getValor(int posicion) throws Exception{
        if(posicion>=0 && posicion<tamaño){
            if(posicion == 0){
                return inicio.getDato();
            } else {
                Nodo aux = inicio;
                for(int i = 0; i<posicion; i++){
                    aux = aux.getSiguiente();
                }
                return aux.getDato();
            }
        } else {
            throw new Exception("Esta posicion no existe en la lista.");
        }
    }
    
    public boolean buscar(int referencia){ //Metodo para buscar en la lista.
        Nodo aux = inicio;
        boolean encontrado = false;
        do{
            if(referencia == aux.getDato()){
                encontrado = true;
            } else {
                aux = aux.getSiguiente();
            }
        } while(aux!=inicio && encontrado!= false);
        return encontrado;
    }
    
    public int getPosicion(int referencia) throws Exception{ //Metodo para obtener una posicion de la lista.
        if(buscar(referencia)){
            Nodo aux = inicio;
            int cont = 0;
            while(referencia!=aux.getDato()){
                cont++;
                aux = aux.getSiguiente();
            }
            return cont;
        } else {
            throw new Exception("Valor no encontrado en la lista.");
        }
    }
    
    public void editarPorReferencia(int referencia, int valor){ //Metodo para editar un nodo por medio de una referencia.
        if(buscar(referencia)){
            Nodo aux = inicio;
            while(aux.getDato() != referencia){
                aux = aux.getSiguiente();
            }
            aux.setDato(valor);
        }
    }
    
    public void editarPorPosicion(int posicion, int valor){ //Metodo para editar una posicion de la lista.
        if(posicion>=0 && posicion<tamaño){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            } else {
                Nodo aux = inicio;  
                for(int i = 0; i<posicion-1; i++){
                    aux = aux.getSiguiente();
                }
                aux.setDato(valor);
            }
        }
    }
    
    public void removerPorReferencia(int referencia){ //Metodo remover por medio de una referencia.
        if(buscar(referencia)){
            if(inicio.getDato() == referencia){
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            } else {
                Nodo aux = inicio;
                while(aux.getSiguiente().getDato()!=referencia){
                    aux = aux.getSiguiente();
                }
                if(aux.getSiguiente() == ultimo){
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            tamaño--;
        }
    }
    
    public void removerPorPosicion(int posicion){ //Metodo para remover un nodo por medio de una posicion.
        if(posicion>=0 && posicion<tamaño){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }
        } else {
            Nodo aux = inicio;
            for(int i = 0; i<posicion-1; i++){
                aux = aux.getSiguiente();
            } if(aux.getSiguiente() == ultimo) {
                aux.setSiguiente(inicio);
                ultimo = aux;
            } else {
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
        }
        tamaño--;
    }
    
    public void eliminar(){ //Metodo para elimiar la lista.
        inicio = null;
        ultimo = null;
        tamaño = 0;
    }
    
    public void listar(){ //Metodo para enlistar la lista.
        if(!isEmpy()){
            Nodo aux = inicio; //Crea una copia de la lista.
            int i = 0;
            do{ //Recorremos la lista hasta llegar al inicio.
                System.out.println("#" + i + " " + aux.getDato()); //Imprimimos los nodos.
                aux = aux.getSiguiente(); //Obtenemos el siguiente nodo
                i++; //Incrementamos el contador.
            } while(aux!=inicio);
        }
    }
}
