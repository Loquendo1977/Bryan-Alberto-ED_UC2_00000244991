/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noLineales.Arboles;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author sergio
 */
public class Nodo {
    private String valor;
    private Nodo hijos[];
    private int numHijosAgregados;
    
    public Nodo(String val){
        valor=val;
        hijos = new Nodo[10];
        numHijosAgregados=0;
    }
    
    public void agregarHijo(Nodo nHijo){
        if (numHijosAgregados==hijos.length) {
           expandir();
        }
        if (numHijosAgregados<hijos.length) {
            hijos[numHijosAgregados] = nHijo;
            numHijosAgregados++;
        }
    }
    
    public void expandir(){
        Nodo nuevoArreglo[] = new Nodo[hijos.length+1];
        for (int i = 0; i < hijos.length; i++) {
            nuevoArreglo[i] = hijos[i];
        }
        hijos=nuevoArreglo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo[] getHijos() {
        return hijos;
    }

    public void setHijos(Nodo[] hijos) {
        this.hijos = hijos;
    }

    public int getNumHijosAgregados() {
        return numHijosAgregados;
    }

    public void setNumHijosAgregados(int numHijosAgregados) {
        this.numHijosAgregados = numHijosAgregados;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nodo other = (Nodo) obj;
        return Objects.equals(this.valor, other.valor);
    }



    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", hijos=" + hijos + '}';
    }
    
    
}
