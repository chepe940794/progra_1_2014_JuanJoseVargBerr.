/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoGoleadores;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class ListaGoleadores {

    private NodoGoleadores listaGoleadores;
    //METODO PARA INSERTAR GOLEADORES.
    public void Insertar(String nombre, NodoGoleadores Goleadores) {
        NodoGoleadores nuevo;
        nuevo = new NodoGoleadores();
        nuevo.setNombre(nombre);
        nuevo.setSiguienteGoleadores(Goleadores.getSiguienteGoleadores());
        nuevo.setEquipos(Goleadores.getEquipos());
        nuevo.setGoles(Goleadores.getGoles());
        

       if(listaGoleadores==null)
        {
            nuevo.setSiguienteGoleadores(null
            );
            listaGoleadores=nuevo;
        }
        else
        {
            NodoGoleadores auxiliar=listaGoleadores;
            while (auxiliar.getSiguienteGoleadores()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteGoleadores();             
            }
            auxiliar.setSiguienteGoleadores(nuevo);
        }        
    }
//METODO IMPRIMIR GOLEADORES.
   public void Imprimir()
    {
        NodoGoleadores recorridoGoleador=listaGoleadores;
        
        
        while(recorridoGoleador!=null)
        {
                JOptionPane.showMessageDialog(null, "El nombre del jugador es: " +recorridoGoleador.getNombre()
                        + "\n " + "Goles anotados: " +recorridoGoleador.getGoles()+ "\n" 
                        + "Equipo: "  +recorridoGoleador.getEquipos());
                           
            
            recorridoGoleador=recorridoGoleador.getSiguienteGoleadores();
        }
    }
    
    public boolean EstaVacia()
    {
        return listaGoleadores==null;
    }

    /**
     * @return the listaResultado
     */
    public NodoGoleadores getListaResultado() {
        return listaGoleadores;
    }

    /**
     * @param listaResultado the listaResultado to set
     */
    public void setListaResultado(NodoGoleadores listaResultado) {
        this.listaGoleadores = listaResultado;
    }

}
