/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_uc2_90851.Lineales;

import ed_uc2_90851.Nodos.NodoD;

/**
 * Firt In, First Out
 * @author sergio
 */
public class CDEC {
    private NodoD h;
    private int size;
    
    public CDEC(){
        h=null;
        size=0;
    }
    
    //Encolar, agregar inicio
    public void enqueue(int val){
        NodoD nN = new NodoD(val);
        if (size==0) {
            nN.setSig(nN);
            nN.setAnt(nN);
            h=nN;
            size++;
        }else{
            nN.setSig(h);
            h.setSig(nN);
            nN.setAnt(h);
            h.setAnt(nN);
            h=nN;
            size++;
        }
        
    }
    //desencolar, eliminar ultimo
    public void dequeue(){
        if(size==1){
            h=null;
            size=0;
        }else if(size>1){
            h.getAnt().getAnt().setSig(h);
            h.setAnt(h.getAnt().getAnt());
            size--;
        }
    }
    //mostrar
    public NodoD peek(){
        return h.getAnt();
    }
}
