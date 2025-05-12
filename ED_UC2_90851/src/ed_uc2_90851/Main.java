/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed_uc2_90851;

import ed_uc2_90851.Nodos.Nodo;
import noLineales.Arboles.ArbolBinario;
import noLineales.Arboles.NodoBinario;


/**
 *
 * @author sergio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.setRaiz(new NodoBinario("A"));
        arbol.getRaiz().setIzq(new NodoBinario("B"));
        arbol.getRaiz().getIzq().setDer(new NodoBinario("D"));
        arbol.getRaiz().getIzq().setIzq(new NodoBinario("C"));
        arbol.getRaiz().getIzq().getDer().setIzq(new NodoBinario("8"));
        arbol.getRaiz().setDer(new NodoBinario("E"));
        
        arbol.preOrder(arbol.getRaiz());
        System.out.println("");
        arbol.posOrder(arbol.getRaiz());
        System.out.println("");
        arbol.inOrder(arbol.getRaiz());
        
    }
    
}
