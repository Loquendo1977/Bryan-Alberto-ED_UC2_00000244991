package lesc;

import nodos.Nodo;

public class LESC<T> {

    private Nodo<T> inicial;
    private int contador;

    public LESC() {
        this.inicial = null;
        this.contador = 0;
    }

    /**
     * Verifica si la lista esta vacia
     *
     * @return true si la lista esta vacia false en caso contrario
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Devuelve el tamano de la lista
     *
     * @return Numero de elementos en la lista
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un elemento al inicio de la lista
     *
     * @param dato Elemento a agregar
     */
    public void addFirst(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
            inicial.siguiente = inicial;
        } else {
            Nodo<T> actual = inicial;
            while (actual.siguiente != inicial) {
                actual = actual.siguiente;
            }
            nuevo.siguiente = inicial;
            actual.siguiente = nuevo;
            inicial = nuevo;
        }
        contador++;
    }

    /**
     * Agrega un elemento al final de la lista
     *
     * @param dato Elemento a agregar
     */
    public void addLast(T dato) {
        if (isEmpty()) {
            addFirst(dato);
        } else {
            Nodo<T> nuevo = new Nodo<>(dato);
            Nodo<T> actual = inicial;
            while (actual.siguiente != inicial) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = inicial;
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
                Nodo<T> actual = inicial;
                while (actual.siguiente != inicial) {
                    actual = actual.siguiente;
                }
                inicial = inicial.siguiente;
                actual.siguiente = inicial;
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
                Nodo<T> actual = inicial;
                while (actual.siguiente.siguiente != inicial) {
                    actual = actual.siguiente;
                }
                actual.siguiente = inicial;
            }
            contador--;
        }
    }

    /**
     * Verifica si la lista contiene un elemento especifico
     *
     * @param dato Elemento a buscar
     * @return true si el elemento esta en la lista false en caso contrario
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
     * Obtiene el elemento en la posicion especificada
     *
     * @param index Indice del elemento a obtener
     * @return Elemento en la posicion indicada
     * @throws IndexOutOfBoundsException Si el indice esta fuera de rango
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
     * Elimina todos los elementos de la lista
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Devuelve una representacion en cadena de la lista
     *
     * @return Representacion en cadena de la lista enlazada circular
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = inicial;
        do {
            sb.append(actual.dato);
            actual = actual.siguiente;
            if (actual != inicial) {
                sb.append(", ");
            }
        } while (actual != inicial);
        sb.append("]");
        return sb.toString();
    }
}
