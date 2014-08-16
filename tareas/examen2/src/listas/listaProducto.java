/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;
import nodos.nodoProducto;
/**
 *
 * @author juan jose
 */
public class listaProducto {
        private nodoProducto listaProducto;

    
     public void AgregarProducto(String nombre ) {

        nodoProducto nuevo;
        nuevo=new nodoProducto();
        nuevo.setNombre(nombre);
        
        if(listaProducto==null)
        {
            nuevo.setSiguienteProducto(null);
            listaProducto=nuevo;
        }
        else
        {
            nodoProducto auxiliar=listaProducto;
            while (auxiliar.getSiguienteProducto()!=null) 
            {  
                auxiliar=auxiliar.getSiguienteProducto();             
            }
            auxiliar.setSiguienteProducto(nuevo);
        }        
    }
     public void EditarProducto(){
         
     }
     public void EliminarProducto(){
         
     }
     public void DesactivarProducto(){
         
     }
    
}
