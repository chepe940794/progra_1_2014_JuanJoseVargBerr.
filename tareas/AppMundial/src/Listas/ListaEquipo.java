/*
 * CLASE PARA LISTA DE EQUIPOS.
 */

package Listas;

import Nodos.NodoEquipo;
import Nodos.NodoJugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimenez
 */
public class ListaEquipo {
    
    private NodoEquipo listaEquipo;
    //METODO PARA INSERTAR .
    
    public void Insertar(String nombre,ListaJugador jugadores)
    {
        NodoEquipo nuevo;
        nuevo=new NodoEquipo();
        nuevo.setNombre(nombre);
        nuevo.setJugadores(jugadores.getListaJugadores());
        if(listaEquipo==null)
        {
            nuevo.setSiguienteEquipo(null);
            listaEquipo=nuevo;
        }
        else
        {
            NodoEquipo auxiliar=listaEquipo;
            while (auxiliar.getSiguienteEquipo()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteEquipo();             
            }
            auxiliar.setSiguienteEquipo(nuevo);
        }        
    }
    
    public void Imprimir()
    {
        NodoEquipo recorridoEquipo=listaEquipo;
        
       
        while(recorridoEquipo!=null)
        {
            
            
            NodoJugador recorridoJugadores=recorridoEquipo.getJugadores();
            while(recorridoJugadores!=null)
            {
                 JOptionPane.showMessageDialog(null,recorridoJugadores.getNombre() +  " \n "+"Edad:  " +recorridoJugadores.getEdad()+" Años. ");
                recorridoJugadores=recorridoJugadores.getSiguienteJugador();
            }
            recorridoEquipo=recorridoEquipo.getSiguienteEquipo();
        }
        
    }
    
    public boolean EstaVacia()
    {
        return listaEquipo==null;
    }
}
