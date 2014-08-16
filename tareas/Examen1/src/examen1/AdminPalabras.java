/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author juan jose
 */
public class AdminPalabras {

    private String[] listaPalabras;

    public AdminPalabras(String[] lista) {
        listaPalabras = lista;
    }

    public int ContarPalabrasPosibles(String letras) {

        int contador = 0;

        for (int i = 0; i < listaPalabras.length; i++) {

            boolean[] usadas = new boolean[letras.length()];
            for (int j = 0; j < usadas.length; j++) {
                usadas[j] = false;
            }

            boolean esPosible = true;
            for (int j = 0; j < listaPalabras[i].length(); j++) {
                boolean encontrada = false;

                for (int k = 0; k < letras.length() && !encontrada; k++) {
                    if (!usadas[k] && listaPalabras[i].charAt(j) == letras.charAt(k)) {

                        encontrada = true;
                        usadas[k] = true;
                    }
                }
                if (!encontrada) {

                    esPosible = false;
                }
            }

            if (esPosible) {
                contador++;
            }
        }
        return contador;
    }
}
