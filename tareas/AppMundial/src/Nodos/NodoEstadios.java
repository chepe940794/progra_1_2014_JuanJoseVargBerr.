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
public class NodoEstadios {

    public String nombre;
    public String clima;
    public int CantidadPersonas;
    public int PartidosJugados;
    public NodoEstadios siguienteEstadio;

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
     * @return the clima
     */
    public String getClima() {
        return clima;
    }

    /**
     * @param clima the clima to set
     */
    public void setClima(String clima) {
        this.clima = clima;
    }

    /**
     * @return the siguienteEstadio
     */
    public NodoEstadios getSiguienteEstadio() {
        return siguienteEstadio;
    }

    /**
     * @param siguienteEstadio the siguienteEstadio to set
     */
    public void setSiguienteEstadio(NodoEstadios siguienteEstadio) {
        this.siguienteEstadio = siguienteEstadio;
    }

    /**
     * @return the CantidadPersonas
     */
    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    /**
     * @param CantidadPersonas the CantidadPersonas to set
     */
    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    /**
     * @return the PartidosJugados
     */
    public int getPartidosJugados() {
        return PartidosJugados;
    }

    /**
     * @param PartidosJugados the PartidosJugados to set
     */
    public void setPartidosJugados(int PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }

}
