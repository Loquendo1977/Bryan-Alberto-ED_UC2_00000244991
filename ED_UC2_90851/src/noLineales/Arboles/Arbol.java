/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noLineales.Arboles;

/**
 *
 * @author sergio
 */
public class Arbol {
    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz=raiz;
    }
    
    public void agregar(String valorPadre, String valorHijo){
        Nodo padre = buscarNodo(raiz, valorPadre);
        if (padre != null) {
            padre.agregarHijo(new Nodo(valorHijo));
        }else{
            System.out.println("Nodo Padre no encontrado");
        }
    }
    
    public Nodo buscarNodo(Nodo actual, String valor){
        if(actual==null) return null;
        if (actual.getValor().equals(valor)) return actual;
        
        for (int i = 0; i < actual.getNumHijosAgregados(); i++) {
            Nodo encontrado = buscarNodo(actual.getHijos()[i],valor);
            if (encontrado != null)return encontrado;  
        }//Posible error
        return null;
    }
    
    public void mostrar(){
        buscarRecursivo(raiz,0);
    }

    private void buscarRecursivo(Nodo nodo, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println("- " + nodo.getValor());
        
        for (int i = 0; i < nodo.getNumHijosAgregados(); i++) {
            buscarRecursivo(nodo.getHijos()[i], nivel+1);
        }
    }
    
}
