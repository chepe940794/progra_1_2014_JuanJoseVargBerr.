/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

/**
 *
 * @author juan jose
 */
public class NodoCalendario {
    private String fecha;
    private NodoCalendario siguienteFecha;

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the siguienteFecha
     */
    public NodoCalendario getSiguienteFecha() {
        return siguienteFecha;
    }

    /**
     * @param siguienteFecha the siguienteFecha to set
     */
    public void setSiguienteFecha(NodoCalendario siguienteFecha) {
        this.siguienteFecha = siguienteFecha;
    }
    
}
