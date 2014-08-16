/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

/**
 *
 * @author juan jose
 */
public class Ejercicio1 {

    private String m[][];

    public Ejercicio1() {
        this.m = new String[5][5];
    }

    public void llenaMatriz(String matriz) {
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = String.valueOf(matriz.charAt(cont));
                cont++;
            }
        }
    }

    public String aTap(String original) {
        if ((original == null) || original.equals("")) {
            return original;
        }
        String puntos = "";
        String letra2;
        String retorno = "";
        int tamaño = m.length;
        int j = 0;
        int cont = 0;
        for (int i = 0; i < tamaño; i++) {
            for (j = 0; j < m[0].length; j++) {
                String letra = "" + original.charAt(cont);
                if (letra.equals("K")) {
                    letra = "C";
                } else if (letra.equals("Ñ")) {
                    letra = "N";
                }
                letra2 = m[i][j];
                if (letra2.equals(letra)) {
                    retorno += "(" + i + "," + j + ")" + " ";
                    cont++;
                    i = -1;
                    break;
                }

            }
            if (cont == original.length()) {
                break;
            }
        }
        return retorno;
    }

}
