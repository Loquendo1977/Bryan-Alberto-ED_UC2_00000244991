package nodos;

public class Nodo<T> {

    public T dato;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;

    /**
     * Constructor de la clase Nodo
     *
     * @param dato Dato que almacenara el nodo
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.anterior = this.siguiente = null;
    }
}
