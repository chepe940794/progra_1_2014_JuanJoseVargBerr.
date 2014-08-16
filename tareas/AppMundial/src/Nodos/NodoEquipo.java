/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

/**
 *
 * @author Jimenez
 */
public class NodoEquipo 
{    
    private String nombre;
    private NodoJugador jugadores;
    private NodoEquipo siguienteEquipo;

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
     * @return the jugadores
     */
    public NodoJugador getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(NodoJugador jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the siguienteEquipo
     */
    public NodoEquipo getSiguienteEquipo() {
        return siguienteEquipo;
    }

    /**
     * @param siguienteEquipo the siguienteEquipo to set
     */
    public void setSiguienteEquipo(NodoEquipo siguienteEquipo) {
        this.siguienteEquipo = siguienteEquipo;
    }
       
}
