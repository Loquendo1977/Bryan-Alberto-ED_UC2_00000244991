package ed_uc2;


class ListaEnlazadaSimple<T> {
    private Nodo<T> inicial;
    private int contador;

    /**
     * Constructor que inicializa la lista vacia.
     */
    public ListaEnlazadaSimple() {
        this.inicial = null;
        this.contador = 0;
    }

    /**
     * Verifica si la lista está vacia.
     * @return true si la lista está vacia, false en caso contrario.
     */
    public boolean isEmpty() {
        return inicial == null;
    }

    /**
     * Devuelve el tamaño de la lista.
     * @return Número de elementos en la lista.
     */
    public int size() {
        return contador;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param dato Elemento a agregar.
     */
    public void addFirst(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.siguiente = inicial;
        inicial = nuevo;
        contador++;
    }

    /**
     * Agrega un elemento al final de la lista.
     * @param dato Elemento a agregar.
     */
    public void addLast(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            inicial = nuevo;
        } else {
            Nodo<T> actual = inicial;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        contador++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void removeFirst() {
        if (!isEmpty()) {
            inicial = inicial.siguiente;
            contador--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void removeLast() {
        if (!isEmpty()) {
            if (inicial.siguiente == null) {
                inicial = null;
            } else {
                Nodo<T> actual = inicial;
                while (actual.siguiente.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = null;
            }
            contador--;
        }
    }

    /**
     * Verifica si la lista contiene un elemento específico.
     * @param dato Elemento a buscar.
     * @return true si el elemento está en la lista, false en caso contrario.
     */
    public boolean contains(T dato) {
        Nodo<T> actual = inicial;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Obtiene el elemento en la posición especificada.
     * @param index Índice del elemento a obtener.
     * @return Elemento en la posición indicada.
     * @throws IndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public T getElement(int index) {
        if (index < 0 || index >= contador) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> actual = inicial;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void clear() {
        inicial = null;
        contador = 0;
    }

    /**
     * Devuelve una representación en cadena de la lista.
     * @return Representación en cadena de la lista enlazada.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = inicial;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}

