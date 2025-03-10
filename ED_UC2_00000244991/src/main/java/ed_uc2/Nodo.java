package ed_uc2;

class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    /**
     * Constructor que inicializa el nodo con un dato.
     * @param dato Valor a almacenar en el nodo.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    
}