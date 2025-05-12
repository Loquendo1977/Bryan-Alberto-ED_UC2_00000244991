/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noLineales;

/**
 *
 * @author sergio
 */
public class Arista {
    private Vertice vOrigen;
    private Vertice vDestino;
    private int peso;
    
    public Arista(Vertice vOrigen, Vertice vDestino, int peso) {
        this.vOrigen = vOrigen;
        this.vDestino = vDestino;
        this.peso = peso;
    }
    

    public Arista(Vertice vOrigen, Vertice vDestino) {
        this.vOrigen = vOrigen;
        this.vDestino = vDestino;
    }

    public Vertice getvOrigen() {
        return vOrigen;
    }

    public void setvOrigen(Vertice vOrigen) {
        this.vOrigen = vOrigen;
    }

    public Vertice getvDestino() {
        return vDestino;
    }

    public void setvDestino(Vertice vDestino) {
        this.vDestino = vDestino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "" + vOrigen + "---- "+ peso  +" --->" + vDestino;
    }
    
    
    
    
    
}
