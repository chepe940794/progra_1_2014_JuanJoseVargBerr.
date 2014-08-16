/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase19;

/**
 *
 * @author juan jose
 */
public class Clase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
         Pila p = new Pila();
         p.Push("Efren");
         p.Push("Joss");
         p.Push("Andrey");
         p.Push("Jose");
         p.Imprimir();
         System.out.println("La cantidad de elementos es: " + p.Cantidad());
         if (p.Vacia()) {
         System.out.println("La pila no esta vacia");
         } else {
         System.out.println("La pila esta vacia");
         p.Pop();
         p.Pop();
         p.Imprimir();

         }*/

        Cola c = new Cola();
        c.Encolar("Efren");
        c.Encolar("Joss");
        c.Encolar("Andrey");
        c.Encolar("Jose");
        c.Imprimir();
        c.Desencolar();
        c.Imprimir();

    }

}
