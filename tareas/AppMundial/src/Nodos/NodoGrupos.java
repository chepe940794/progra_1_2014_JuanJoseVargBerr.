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
public class NodoGrupos {
    private String nombre;
    private NodoGrupos siguienteGrupos;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siguienteGrupos
     */
    public NodoGrupos getSiguienteGrupos() {
        return siguienteGrupos;
    }

    /**
     * @param siguienteGrupos the siguienteGrupos to set
     */
    public void setSiguienteGrupos(NodoGrupos siguienteGrupos) {
        this.siguienteGrupos = siguienteGrupos;
    }
}
