/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_90851.Lineales;

import ed_uc2_90851.Nodos.NodoD;

/**
 *
 * @author sergio
 */
public class LDEC {
    private NodoD inicial;
    private int tam;


    public LDEC(NodoD nNodo) {
        this.inicial = nNodo;
        inicial.setAnt(inicial);
        inicial.setSig(inicial);
        tam++;
    }
    
    public void addFirst(NodoD nN){
        if (tam==1) {
            nN.setSig(inicial);
            inicial.setSig(nN);
            inicial.setAnt(nN);
            nN.setAnt(inicial);
            inicial=nN;
            tam++;
        }else if(tam >1){
            nN.setSig(inicial);
            nN.setAnt(inicial.getAnt());
            inicial.getAnt().setSig(nN);
            inicial.setAnt(nN);
            inicial =nN;
            tam++;
        }
    } 
    
    public void removeLast(){
        if (tam==1) {
            inicial=null;
            tam=0;
        }else{
            inicial.getAnt().getAnt().setSig(inicial);
            inicial.setAnt(inicial.getAnt().getAnt());
            tam--;
          
        }
    }
    
    
    
}
