package itson.lde_uc2;

import nodos.Nodo;

public class LDE<T> {
    private Nodo<T> inicio;
    private int tamaño;

    /**
     * Constructor de la lista, inicia vacia.
     */
    public LDE() {
        this.inicio = null;
        this.tamaño = 0;
    }

    /**
     * Verifica si la lista esta vacia.
     * @return true si está vacía, false si tiene elementos.
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    /**
     * Retorna el número de elementos en la lista.
     * @return Cantidad de elementos en la lista.
     */
    public int tamaño() {
        return tamaño;
    }

    /**
     * Agrega un elemento al inicio de la lista.
     * @param dato Elemento a agregar.
     */
    public void agregarInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (!estaVacia()) {
            nuevo.siguiente = inicio;
            inicio.anterior = nuevo;
        }
        inicio = nuevo;
        tamaño++;
    }

    /**
     * Agrega un elemento al final de la lista.
     * @param dato Elemento a agregar.
     */
    public void agregarFinal(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            Nodo<T> actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
        tamaño++;
    }

    /**
     * Elimina el primer elemento de la lista.
     */
    public void eliminarInicio() {
        if (!estaVacia()) {
            inicio = inicio.siguiente;
            if (inicio != null) {
                inicio.anterior = null;
            }
            tamaño--;
        }
    }

    /**
     * Elimina el ultimo elemento de la lista.
     */
    public void eliminarFinal() {
        if (!estaVacia()) {
            if (inicio.siguiente == null) {
                inicio = null;
            } else {
                Nodo<T> actual = inicio;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.anterior.siguiente = null;
            }
            tamaño--;
        }
    }

    /**
     * Verifica si un elemento esta en la lista.
     * @param dato Elemento a buscar.
     * @return true si esta en la lista, false si no.
     */
    public boolean contiene(T dato) {
        Nodo<T> actual = inicio;
        while (actual != null) {
            if (actual.dato.equals(dato)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * Obtiene un elemento en una posicion especifica.
     * @param indice Posicion del elemento.
     * @return Elemento en la posicion dada.
     * @throws IndexOutOfBoundsException Si el indice esta fuera de rango.
     */
    public T obtenerElemento(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        Nodo<T> actual = inicio;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    /**
     * Elimina todos los elementos de la lista.
     */
    public void limpiar() {
        inicio = null;
        tamaño = 0;
    }

    /**
     * Representacion en cadena de la lista.
     * @return Lista en formato de texto.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Nodo<T> actual = inicio;
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
