    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Nodos.NodoEstadios;
import Nodos.NodoJugador;

import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class ListaEstadios {

    private NodoEstadios listaEstadios;
    //variable para el nodo inicial
    private NodoEstadios primero;
    //variable para el nodo final
    private NodoEstadios ultimo;
    //variabale para el tamaño del nodo
    private int tamaño;
    
    public ListaEstadios (){
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    //Metodo para agregar un Estadio a la lista
    public void Insertar(String nombre, String clima, int PartidosJugados, int CantidadPersonas) {
        
        System.out.println(String.valueOf(listaEstadios));
        if (EstaVacia()) {
            NodoEstadios nuevo;
        nuevo = new NodoEstadios();
        nuevo.setNombre(nombre);
        nuevo.setClima(clima);
        nuevo.setPartidosJugados(PartidosJugados);
        nuevo.setCantidadPersonas(CantidadPersonas);
            this.primero = nuevo;
                this.ultimo = nuevo;
            listaEstadios = nuevo;
            System.out.println("Nuevo" + String.valueOf(nuevo));
        }else{
            NodoEstadios nuevo;
        nuevo = new NodoEstadios();
        nuevo.setNombre(nombre);
        nuevo.setClima(clima);
        nuevo.setPartidosJugados(PartidosJugados);
        nuevo.setCantidadPersonas(CantidadPersonas);
        this.ultimo.siguienteEstadio=nuevo;
        this.ultimo=nuevo;
        }
        tamaño ++;
        System.out.println(String.valueOf(listaEstadios));
    }

    //Metodo para imprimir los datos de la lista
    public void Imprimir() {
        NodoEstadios recorridoEstadios = listaEstadios;

        while (recorridoEstadios != null) {
            JOptionPane.showMessageDialog(null, "El nombre del estadio es: " + recorridoEstadios.getNombre()
                    + "\n " + "El clima es: " + recorridoEstadios.getClima() + "\n"
                    + "La cantidad de expectadores es de: " + recorridoEstadios.getCantidadPersonas()
                    + "\n" + "La cantidad de partidos que se jugaron son: "
                    + recorridoEstadios.getPartidosJugados());

            recorridoEstadios = recorridoEstadios.getSiguienteEstadio();
        }
    }

    //Metodo que imprime una posicion de la lista
    public void toStringPosicion(int num) {
        String retorno = "";
        if (!this.EstaVacia()) {
            NodoEstadios temp = this.primero;
            for (int i = 0; i < num; i++) {
                if((num-1) == i){
                JOptionPane.showMessageDialog(null, "El nombre del estadio es: " + String.valueOf(temp.nombre)+ "\n"+
                        "El clima es: " + String.valueOf(temp.clima) + "\n" + "La cantidad de partidos jugados son: " + 
                        String.valueOf(temp.PartidosJugados) + "\n" + "La cantidad de expectadores es de: " +
                        String.valueOf(temp.CantidadPersonas) + "\n");
                }
                temp = temp.siguienteEstadio;
            }
        }
    }
    
    //Metodo que imprime los nombres de los estadios
    public String toStringNombre() {
        String retorno = "";
        if (!this.EstaVacia()) {
            NodoEstadios temp = this.primero;
            for (int i = 0; i < tamaño; i++) {
                retorno = retorno + (i+1)+ " "+ String.valueOf(temp.nombre)+ "\n";
                temp = temp.siguienteEstadio;
            }
        }
        return retorno + "0 Regresar";
    }
    
    //Metodo que devuelve un true si la lista esta vacia
    public boolean EstaVacia() {
        return (this.primero == null);
    }

    /**
     * @return the listaEstadios
     */
    public NodoEstadios getListaEstadios() {
        return listaEstadios;
    }

    /**
     * @param listaEstadios the listaEstadios to set
     */
    public void setListaEstadios(NodoEstadios listaEstadios) {
        this.listaEstadios = listaEstadios;
    }

    //Metodo para modificar los datos de la lista
    public void ModificarEstadio(String nombre, String nuevoNombre, int cantidadpersonas) {
        NodoEstadios siguienteEstadios = listaEstadios;
        while (siguienteEstadios != null) {
            if (nombre.equals(siguienteEstadios.getNombre())) {
                siguienteEstadios.setNombre(nuevoNombre);
                siguienteEstadios.setCantidadPersonas(cantidadpersonas);
                return;
            }
            siguienteEstadios = siguienteEstadios.getSiguienteEstadio();
        }
  
  } 
    private void setListaEstadioss(NodoEstadios listaEstadios) {
        this.listaEstadios = listaEstadios;
    }
    
}
