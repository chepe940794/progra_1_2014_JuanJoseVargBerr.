/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class Metodos {

    //Variables
    int matriz_fila;
    int matriz_columna;
    String[][] matrizAliado;
    String[][] matrizEnemiga;
    int Cbarcos;
    String nombre, nombre2;

    public void IniciarNuevaPartida() {

        String tablero = "";

        nombre = JOptionPane.showInputDialog(" Digite nombre jugador #1 ");
        nombre2 = JOptionPane.showInputDialog(" Digite nombre jugador #2 ");

        matriz_fila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        matriz_columna = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

        matrizAliado = new String[matriz_fila][matriz_columna];
        matrizEnemiga = new String[matriz_fila][matriz_columna];

        tablero += "<html><body COLOR=#1558A0>" + nombre + "</body></html> \n";

        tablero += "<html><body><table border='" + 1 + "' style='" + "width:" + 300 + "px" + "' >";

        for (int x = 0; x < matrizAliado.length; x++) {

            tablero += "<tr>";
            for (int y = 0; y < matrizAliado[x].length; y++) {

                tablero += "<th>       </th>";
                matrizAliado[x][y] = "<th>       </th>";

            }

            tablero += "</tr>";
        }

        tablero += "</table></body></html>";

        tablero += "<html><body COLOR=#1558A0>" + nombre2 + "</body></html> \n";

        tablero += "<html><body COLOR=#1558A0>" + nombre2 + "</body></html> \n";

        tablero += "<html><body><table border='" + 1 + "' style='" + "width:" + 300 + "px" + "' >";

        for (int x = 0; x < matrizEnemiga.length; x++) {

            tablero += "<tr>";
            for (int y = 0; y < matrizEnemiga[x].length; y++) {

                tablero += "<th>       </th>";
                matrizEnemiga[x][y] = "<th>       </th>";

            }

            tablero += "</tr>";

        }

        tablero += "</table></body></html>";

        tablero += "<html><body COLOR=#1558A0>JUGADOR 1</body></html> \n";

        JOptionPane.showMessageDialog(null, tablero);

        Jugar();

    }

    public void Jugar() {
        boolean validar;
        boolean validar2;
        String tablero = "";

        Cbarcos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de barcos del juego"));

        Object CFilas[] = new Object[matriz_fila];
        Object CColumnas[] = new Object[matriz_columna];
        int cont = 0;
        for (int x = 0; x < matriz_fila; x++) {

            CFilas[x] = String.valueOf(cont);
            cont++;

        }

        cont = 0;

        for (int y = 0; y < matriz_columna; y++) {

            CColumnas[y] = String.valueOf(cont);
            cont++;

        }
        cont = 1;
        JOptionPane.showMessageDialog(null, nombre + " Seleccione los barcos");

        for (int x = 0; x < Cbarcos; x++) {

            JOptionPane.showMessageDialog(null, "Barco numero " + cont);

            Object fila = JOptionPane.showInputDialog(null, "Selecione las filas disponibles", " ",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    CFilas,
                    "0");
            Object columna = JOptionPane.showInputDialog(null, "Selecione las columnas disponibles", " ",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    CColumnas,
                    "0");

            validar = PonerBarcosAli(Integer.parseInt(String.valueOf(fila)),
                    Integer.parseInt(String.valueOf(columna)));
            if (validar == true) {
                cont++;
            } else {
                x--;
                JOptionPane.showMessageDialog(null, "Ya existe un barco en esa posición", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        tablero += "<html><body COLOR=#1558A0>" + nombre + "</body></html> \n";

        tablero += "<html><body><table border='" + 1 + "' style='" + "width:" + 300 + "px" + "' >";

        for (int x = 0; x < matrizAliado.length; x++) {

            tablero += "<tr>";
            for (int y = 0; y < matrizAliado[x].length; y++) {

                tablero += matrizAliado[x][y];

            }

            tablero += "</tr>";

        }
        tablero += "\n";
        JOptionPane.showMessageDialog(null, tablero);
        JOptionPane.showMessageDialog(null, nombre2 + " Seleccion los barcos");

        cont = 1;
        for (int x = 0; x < Cbarcos; x++) {

            JOptionPane.showMessageDialog(null, "Barco numero " + cont);

            Object fila = JOptionPane.showInputDialog(null, "Selecione las filas disponibles", " ",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    CFilas,
                    "0");
            Object columna = JOptionPane.showInputDialog(null, "Selecione las columnas disponibles", " ",
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono defecto
                    CColumnas,
                    "0");

             validar2 = PonerBarcosEne(Integer.parseInt(String.valueOf(fila)),
                    Integer.parseInt(String.valueOf(columna)));
            if (validar2 == true) {
                cont++;
            } else {
                x--;
                JOptionPane.showMessageDialog(null, "Ya existe un barco en esa posición", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            
        }

        tablero += "<html><body COLOR=#1558A0>" + nombre2 + "</body></html> \n";

        tablero += "<html><body><table border='" + 1 + "' style='" + "width:" + 300 + "px" + "' >";

        for (int x = 0; x < matrizEnemiga.length; x++) {

            tablero += "<tr>";

            for (int y = 0; y < matrizEnemiga[x].length; y++) {

                tablero += matrizEnemiga[x][y];

            }

            tablero += "</tr>";

        }

        JOptionPane.showMessageDialog(null, tablero);
    }

    public boolean PonerBarcosAli(int fila, int columna) {
        String xAli;
        boolean retorno = false;
        
        
        xAli = matrizAliado[fila][columna];
        if (xAli.equals("<th>       </th>")) {
            matrizAliado[fila][columna] = "<th>  X     </th>";
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;

    }

   public boolean PonerBarcosEne(int fila, int columna) {
        String xEne;
        boolean retorno2 = false;
        
        
        xEne = matrizEnemiga[fila][columna];
        if (xEne.equals("<th>       </th>")) {
            matrizEnemiga[fila][columna] = "<th>  O     </th>";
            retorno2 = true;
        } else {
            retorno2 = false;
        }
        return retorno2;

    }
   
  
   
   
   

   }
