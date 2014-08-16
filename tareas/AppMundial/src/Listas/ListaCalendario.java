/*
 *CLASE PARA LA LISTA DE CALENDARIOS.
 */
package Listas;

import Nodos.NodoCalendario;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose Y KEVIN.
 */
public class ListaCalendario {

    private NodoCalendario listaCalendario;
//METODO INSERTAR.
    public void Insertar(String fecha) {
        NodoCalendario nuevo;
        nuevo = new NodoCalendario();
        nuevo.setFecha(fecha);

        if (getListaCalendario() == null) {
            nuevo.setSiguienteFecha(null);
            setListaCalendario(nuevo);
        } else {
            NodoCalendario auxiliar = getListaCalendario();
            while (auxiliar.getSiguienteFecha() != null) {
                auxiliar = auxiliar.getSiguienteFecha();
            }
            auxiliar.setSiguienteFecha(nuevo);
        }
    }
//METODO IMPRIMIR.
    public void Imprimir() {
        NodoCalendario recorridoJugador = getListaCalendario();

        JOptionPane.showMessageDialog(null, "Calendario de los partidos.");
        while (recorridoJugador != null) {
            JOptionPane.showMessageDialog(null, recorridoJugador.getFecha());
            recorridoJugador = recorridoJugador.getSiguienteFecha();
        }

    }

    public boolean EstaVacia() {
        return getListaCalendario() == null;
    }

    /**
     * @return the listaCalendario
     */
    public NodoCalendario getListaCalendario() {
        return listaCalendario;
    }

    /**
     * @param listaCalendario the listaCalendario to set
     */
    public void setListaCalendario(NodoCalendario listaCalendario) {
        this.listaCalendario = listaCalendario;
    }

    public void Insertar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
