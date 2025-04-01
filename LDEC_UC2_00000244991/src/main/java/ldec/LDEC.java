package ldec;

import nodos.Nodo;

public class LDEC<T> {
        private Nodo<T> inicial;
    private int contador;

    /**
     * Constructor de la lista
     */
    public LDEC() {
        this.inicial = null;
        this.contador = 0;
    }

    /**
     * Verifica si la lista esta vacia
     * @return true si esta vacia, false en caso contrario
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Obtiene el tamaño de la lista
     * @return Cantidad de elementos en la lista
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un elemento al inicio de la lista
     * @param dato Elemento a agregar
     */
    public void addFirst(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.siguiente = inicial;
            inicial.anterior = inicial;
        } else {
            Nodo<T> ultimo = inicial.anterior;
            nuevo.siguiente = inicial;
            nuevo.anterior = ultimo;
            inicial.anterior = nuevo;
            ultimo.siguiente = nuevo;
            inicial = nuevo;
        }
        contador++;
    }

    /**
     * Agrega un elemento al final de la lista
     * @param dato Elemento a agregar
     */
    public void addLast(T dato) {
        if (isEmpty()) {
            addFirst(dato);
        } else {
            Nodo<T> nuevo = new Nodo<>(dato);
            Nodo<T> ultimo = inicial.anterior;
            nuevo.siguiente = inicial;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            inicial.anterior = nuevo;
            contador++;
        }
    }

    /**
     * Elimina el primer elemento de la lista
     */
    public void removeFirst() {
        if (!isEmpty()) {
            if (contador == 1) {
                inicial = null;
            } else {
                Nodo<T> ultimo = inicial.anterior;
                inicial = inicial.siguiente;
                inicial.anterior = ultimo;
                ultimo.siguiente = inicial;
            }
            contador--;
        }
    }

    /**
     * Elimina el ultimo elemento de la lista
     */
    public void removeLast() {
        if (!isEmpty()) {
            if (contador == 1) {
                inicial = null;
            } else {
                Nodo<T> ultimo = inicial.anterior;
                Nodo<T> nuevoUltimo = ultimo.anterior;
                nuevoUltimo.siguiente = inicial;
                inicial.anterior = nuevoUltimo;
            }
            contador--;
        }
    }

    /**
     * Verifica si la lista contiene un elemento
     * @param dato Elemento a buscar
     * @return true si el elemento esta en la lista, false en caso contrario
     */
    public boolean contains(T dato) {
        if (!isEmpty()) {
            Nodo<T> actual = inicial;
            do {
                if (actual.dato.equals(dato)) {
                    return true;
                }
                actual = actual.siguiente;
            } while (actual != inicial);
        }
        return false;
    }

    /**
     * Obtiene el elemento en una posicion especifica
     * @param index Posicion del elemento
     * @return Elemento en la posicion dada
     */
    public T getElement(int index) {
        if (index < 0 || index >= contador) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        Nodo<T> actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Limpia la lista
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Representacion en cadena de la lista
     * @return Cadena con los elementos de la lista
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = inicial;
        do {
            sb.append(actual.dato).append(", ");
            actual = actual.siguiente;
        } while (actual != inicial);
        sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
