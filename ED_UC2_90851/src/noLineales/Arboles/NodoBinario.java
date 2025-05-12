/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noLineales.Arboles;

import java.util.Objects;

/**
 *
 * @author sergio
 */
public class NodoBinario {
    String etiqueta;
    NodoBinario izq;
    NodoBinario der;
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.etiqueta);
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
        final NodoBinario other = (NodoBinario) obj;
        return Objects.equals(this.etiqueta, other.etiqueta);
    }
   

    public NodoBinario(String etiqueta) {
        this.etiqueta = etiqueta;
        
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public NodoBinario getIzq() {
        return izq;
    }

    public void setIzq(NodoBinario izq) {
        this.izq = izq;
    }

    public NodoBinario getDer() {
        return der;
    }

    public void setDer(NodoBinario der) {
        this.der = der;
    }
    
    
}
