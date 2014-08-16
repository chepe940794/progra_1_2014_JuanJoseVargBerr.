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
public class NodoGoleadores {
    
    private String nombre ;
    private String equipos;
    private int goles;
    private NodoGoleadores siguienteGoleadores;

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
     * @return the equipos
     */
    public String getEquipos() {
        return equipos;
    }

    /**
     * @param equipos the equipos to set
     */
    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    /**
     * @return the goles
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return the siguienteGoleadores
     */
    public NodoGoleadores getSiguienteGoleadores() {
        return siguienteGoleadores;
    }

    /**
     * @param siguienteGoleadores the siguienteGoleadores to set
     */
    public void setSiguienteGoleadores(NodoGoleadores siguienteGoleadores) {
        this.siguienteGoleadores = siguienteGoleadores;
    }
    
    
}
