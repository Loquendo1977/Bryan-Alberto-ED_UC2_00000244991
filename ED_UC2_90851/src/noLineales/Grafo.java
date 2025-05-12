/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noLineales;

/**
 *
 * @author sergio
 */
public class Grafo {
   Vertice vertices[];
   Arista adyasencia[][];
   int cantidadVertices;
   int maxVertices;

    public Grafo(int tam) {
        this.vertices = new Vertice[tam];
        adyasencia = new Arista[tam][tam];
        cantidadVertices= 0;
        maxVertices = tam;
    }
    
    public void agregarVertice( Vertice nV) {
        if (cantidadVertices < maxVertices) {
            vertices[cantidadVertices] = nV;
            cantidadVertices ++;
        }
    }
    
   private int buscarIndice(String valor){
       for (int i = 0; i < cantidadVertices; i++) {
           if (vertices[i].getValor().equals(valor)) {
               return i;
           }
       }
       return -1;
   }
   
   public void agregarArista(String origen, String destino){
       int i = buscarIndice(origen);
       int j = buscarIndice(destino);
       
       if (i!=-1 && j!=-1) {
           adyasencia[i][j]=new Arista(vertices[i], vertices[j]);
       }
       
   }
   
   public void mostrarGrafo(){
       for (int i = 0; i < cantidadVertices; i++) {
           System.out.println("Vertice "+vertices[i].toString());
           
           for (int j = 0; j < cantidadVertices; j++) {
               if (adyasencia[i][j]!=null) {
                   System.out.println(adyasencia[i][j].toString());
               }
           }
           System.out.println();
       }
   }
   
}
