/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen2;

import javax.swing.JOptionPane;

/**
 *
 * @author juan jose
 */
public class Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc1;
        do{
            opc1=Integer.parseInt(JOptionPane.showInputDialog("MENU"
            + "\n1: crear nueva factura."
                    + "\n2: Editarla factura."
                    + "\n3: Desactivar la Factura."
                    + "\n4: Reeimprimir factura."
                    + "\n5: Agregar inventario."
                    + "\n6: Editar inventario."
                    + "\n7: Desactivar inventario."
                    + "\n8: Agregar mas Productos a un inventario."
                    + "\n0: salir"));
            switch(opc1){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
            
        }while(opc1!=0);
        
    }
    
    
}
