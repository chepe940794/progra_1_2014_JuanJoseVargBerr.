/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class Examen1 {

    public static void main(String[] args) {

        /*
         Inicio de la Primera parte del examen
         */
        String matriz = "ABCDEFGHIJLMNOPQRSTUVWXYZ";
        Ejercicio1 c = new Ejercicio1();
        String retorno;
        String mensaje = JOptionPane.showInputDialog("Digite el mensaje");
// Convierte el mensaje a mayusculas
        mensaje = mensaje.toUpperCase();
        c.llenaMatriz(matriz);
        retorno = c.aTap(mensaje);
        JOptionPane.showMessageDialog(null, retorno);

    //Fin de la Primera parte del examen
    /*
         Inicio de la Segunda parte del examen
         */
        /*
         String[] lista = {" auto ", " pato ", " palo ", " poto ", " amar ", " amor ",
         " loca ", " loco ", " polo ", " poco ", " poca ", " rota ", " roto "};
         AdminPalabras admin = new AdminPalabras( lista );
         String[] letras = {" escalopa ", " automotor", " percatado"};
         for(int i = 0; i < letras . length ; i ++) {
         int cont = admin .ContarPalabrasPosibles(letras [i ]);
         JOptionPane.showMessageDialog(null,letras [i] + ": " + cont );
         }*/
    //Fin de la Segunda parte del Examen
    }
}
