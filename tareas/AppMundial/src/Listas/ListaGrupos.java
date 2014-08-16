/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Listas;

import Nodos.NodoGrupos;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class ListaGrupos {
    
    private NodoGrupos listaGrupos;
    //METODO PARA INSERTAR EQUIPOS DE CADA GRUPO.
    public void Insertar(String nombre) {
        NodoGrupos nuevo;
        nuevo = new NodoGrupos();
        nuevo.setNombre(nombre);
        
        if (getListaGrupos() == null) {
            nuevo.setSiguienteGrupos(null);
            setListaGrupos(nuevo);
        } else {
            NodoGrupos auxiliar = getListaGrupos();
            while (auxiliar.getSiguienteGrupos() != null) {
                auxiliar = auxiliar.getSiguienteGrupos();
            }
            auxiliar.setSiguienteGrupos(nuevo);
        }
    }
//METODO PARA IMPRIMIR LOS EQUIPO DE CADA GRUPO.
    public void Imprimir() {
        NodoGrupos recorridoGrupos = getListaGrupos();

        
        while (recorridoGrupos != null) {
            JOptionPane.showMessageDialog(null,recorridoGrupos.getNombre() + " ");
            recorridoGrupos = recorridoGrupos.getSiguienteGrupos();
        }
        
    }

    public boolean EstaVacia() {
        return getListaGrupos() == null;
    }

    /**
     * @return the listaGrupos
     */
    public NodoGrupos getListaGrupos() {
        return listaGrupos;
    }

    /**
     * @param listaGrupos the listaGrupos to set
     */
    public void setListaGrupos(NodoGrupos listaGrupos) {
        this.listaGrupos = listaGrupos;
    }
    
}
