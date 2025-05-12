package noLineales.Arboles;

/**
 *
 * @author sergio
 */
public class ArbolBinario {
    public NodoBinario raiz;

    public NodoBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoBinario raiz) {
        this.raiz = raiz;
    }
    
    public void preOrder(NodoBinario r){
        if (r !=null) {
            System.out.print(r.etiqueta + " ");
            preOrder(r.izq);
            preOrder(r.der);
        }   
    }
    
    public void inOrder(NodoBinario r){
        if (r != null) {
            inOrder(r.izq);
            System.out.print(r.etiqueta + " ");
            inOrder(r.der);
        }
    }
    
    public void posOrder(NodoBinario r){
        if (r != null) {
            posOrder(r.izq);
            posOrder(r.der);
            System.out.print(r.etiqueta + " ");
        }
    }
    
        public void insertarNodo(String etiqueta) {
        NodoBinario nuevo = new NodoBinario(etiqueta);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    private void insertarRecursivo(NodoBinario actual, NodoBinario nuevo) {
        int comparacion = nuevo.etiqueta.compareTo(actual.etiqueta);

        if (comparacion < 0) {
            if (actual.izq == null) {
                actual.izq = nuevo;
            } else {
                insertarRecursivo(actual.izq, nuevo);
            }
        } else if (comparacion > 0) {
            if (actual.der == null) {
                actual.der = nuevo;
            } else {
                insertarRecursivo(actual.der, nuevo);
            }
        } else {
            System.out.println("Valor duplicado '" + nuevo.etiqueta + "' no se insertó.");
        }
    }
}
