package nodos;

public class Nodo<T> {

    public T dato;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;

    /**
     * Constructor del nodo.
     *
     * @param dato El valor a almacenar.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}
