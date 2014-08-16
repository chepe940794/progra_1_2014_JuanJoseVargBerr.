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
 * @author Jimenez
 */
public class ListaJugador {

    private NodoJugador listaJugadores;
    //variable para el nodo inicial
    private NodoJugador primero;
    //variable para el nodo final
    private NodoJugador ultimo;
    //variabale para el tamaño del nodo
    private int tamaño;

    //Metodo para insertar los datos de las lista
    public void Insertar(String nombre, int edad) {

        if (EstaVacia()) {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            this.primero = nuevo;
            this.ultimo = nuevo;

            listaJugadores = nuevo;
            listaJugadores.siguienteJugador = null;
            System.out.println("Nuevo");
        } else {
            NodoJugador nuevo;
            nuevo = new NodoJugador();
            nuevo.setNombre(nombre);
            nuevo.setEdad(edad);
            this.ultimo.siguienteJugador = nuevo;
            this.ultimo = nuevo;
        }
    }

    public void Ordenar() {
        NodoJugador aux;
        aux = listaJugadores;
        NodoJugador aux2;
        aux2 = null;
        String nombre = "";
        int edad = 0;
        while (aux.getSiguienteJugador() != null) {
            aux2 = aux.getSiguienteJugador();
            while (aux2 != null) {
                if (aux.getEdad() > aux2.getEdad()) {
                    nombre = aux2.getNombre();
                    edad = aux2.getEdad();
                    aux2.setEdad(aux.getEdad());
                    aux2.setNombre(aux.getNombre());
                    aux.setEdad(edad);
                    aux.setNombre(nombre);
                }
                aux2 = aux2.getSiguienteJugador();
            }
            aux = aux.getSiguienteJugador();
        }
    }

    //Metodo que imprime el nombre del Jugador modificado
    public void ImprimirNombre(String nomNuevo) {
        NodoJugador recorridoJugador = listaJugadores;
        int cont = 1;
        System.out.println("Listado de todos los elementos de la lista");
        while (recorridoJugador != null) {
            if (nomNuevo.equals(recorridoJugador.getNombre())){
                JOptionPane.showMessageDialog(null,recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            
            System.out.println(cont);
            cont++;
            }
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();

    }
    
    //Metodo que imprime una posicion de la lista
    public void toStringPosicion(int num) {
        String retorno = "";
        if (!this.EstaVacia()) {
            NodoJugador temp = this.primero;
            for (int i = 0; i < num; i++) {
                if((num-1) == i){
                JOptionPane.showMessageDialog(null, "El nombre del jugador es: " + String.valueOf(temp.nombre)+ "\n"+
                        "La edad es: " + String.valueOf(temp.edad) + "\n" );
                }
                temp = temp.siguienteJugador;
            }
        }
    }

    public void ImprimirUltimo() {
        NodoJugador recorridoJugador = getListaJugadores();

        System.out.println("El jugador mas viejo es: ");
        while (recorridoJugador != null) {
            if (recorridoJugador.getSiguienteJugador() == null) {
                System.out.println(recorridoJugador.getNombre() + " " + recorridoJugador.getEdad());
            }
            recorridoJugador = recorridoJugador.getSiguienteJugador();
        }
        System.out.println();
    }

    public void ImprimirPrimero() {
        NodoJugador recorridoJugador = getListaJugadores();

    }

    //Metodo que devuelve un true si la lista esta vacia
    public boolean EstaVacia() {
        return (this.primero == null);
    }

    //Metodo para eliminar datos de la lista
    public void EliminarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        NodoJugador anterior = siguienteJugador;

        if (siguienteJugador == null) {
            System.out.println("Lista de jugadores vacia");
            return;
        }
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                if (siguienteJugador == listaJugadores) {
                    listaJugadores = siguienteJugador.getSiguienteJugador();
                    return;
                }
                anterior.setSiguienteJugador(siguienteJugador.getSiguienteJugador());
                return;
            }
            anterior = siguienteJugador;
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
    }

    public NodoJugador BuscarJugador(String nombre) {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                return siguienteJugador;
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return null;
    }

    //Metodo para modificar los datos de la lista
    public String ModificarJugador(String nombre, String nuevoNombre, int edad) {
        NodoJugador siguienteJugador = listaJugadores;
        while (siguienteJugador != null) {
            if (nombre.equals(siguienteJugador.getNombre())) {
                siguienteJugador.setNombre(nuevoNombre);
                siguienteJugador.setEdad(edad);
            }
            siguienteJugador = siguienteJugador.getSiguienteJugador();
        }
        return "";
    }

    /**
     * @return the listaJugadores
     */
    public NodoJugador getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    private void setListaJugadores(NodoJugador listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
