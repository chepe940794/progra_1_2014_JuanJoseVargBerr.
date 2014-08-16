/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalista1;

/**
 *
 * @author Estudiante
 */
public class NodoDeLista {

    private int dato;
    private NodoDeLista siguiente;
    

    public NodoDeLista() {
        this.siguiente = null;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return this.dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoDeLista getSiguiente() {
        return this.siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }

    

   
    

}
