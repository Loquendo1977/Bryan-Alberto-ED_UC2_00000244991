package nodos;

public class Nodo<T> {
    public T dato;
    public Nodo<T> siguiente;

    /**
     * Constructor que inicializa el nodo con un dato
     * @param dato Valor a almacenar en el nodo
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
