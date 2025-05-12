/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_90851.Lineales;

import ed_uc2_90851.Nodos.Nodo;

/**
 *
 * @author sergio
 */
public class LESC {
    private Nodo inicial;
    int tam;

   
    public LESC(Nodo nN) {
        this.inicial = nN;
        inicial.setSig(inicial);
        tam++;
    }
    
    public void addFirst(int x){
         Nodo nN = new Nodo(x);
         if (tam==1) {
            nN.setSig(inicial);
            inicial.setSig(nN);
            inicial=nN;
        }else if(tam >1){
            Nodo actual = inicial;
            while(actual.getSig()!=inicial){
                actual=actual.getSig();
            }
            actual.setSig(nN);
            nN.setSig(inicial);
            inicial= nN;
            
        }
         
        
//        Nodo nN = new Nodo(x);
//        inicial.setSig(nN);
//        nN.setSig(inicial);
//        inicial=nN;
    }
    
    public void addLast(Nodo nN){
        Nodo actual = inicial;
        while(actual.getSig()!=inicial){
            actual=actual.getSig();
        }
        actual.setSig(nN);
        nN.setSig(inicial);
        tam++;
    }
    
    public void removeLast(){
        if (tam==1) {
            inicial=null;
            tam=0;
        }else if(tam>1){
            Nodo aux = inicial;
            while(aux.getSig().getSig()!=inicial){
                aux=aux.getSig();
            }
            aux.setSig(null);
            aux.setSig(inicial);
            tam--;
        }
    }
    
    
}
