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
public class LDE {
    private NodoD inicial;
    private int tam = 0;
    
    public boolean addLast(int val){
        //Crear el nuevo nodo
        NodoD nN = new NodoD(val);
        
        if (tam == 0) {
            inicial = nN;
            tam++;
            return true;
        }else{
            NodoD actual = inicial; 
            while(actual.getSig() != null){
                actual = actual.getSig();
            }
            actual.setSig(nN);
            nN.setAnt(actual);
            tam++;
            return true;
        }
    }
    
    public void removeFirst(){
        if (tam == 1) {
            inicial=null;
            tam--;
        }else if(tam>1){
            inicial = inicial.getSig();
            inicial.getAnt().setSig(null);
            inicial.setAnt(null);
            tam--;
        }
    }
    
    public boolean contains(int val){
        NodoD actual = inicial;
        boolean b=false;
        while(actual !=null){
            if (actual.getValor()==val) {
                b = true;
                break;
            }else{
                actual=actual.getSig();
            }  
        }
        return b;
    }
    
    
    
    public void print(){
        NodoD actual = inicial; 
        while(actual != null){
            System.out.print(actual.toString());
            actual = actual.getSig();
        }
    
    }
    
}
