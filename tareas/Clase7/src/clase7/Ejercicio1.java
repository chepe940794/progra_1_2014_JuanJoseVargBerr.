/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase7;

/**
 *
 * @author juan jose
 */
public class Ejercicio1 {
    
    
    private String email;
    
    public Ejercicio1 (String pEmail)
    {
         this.email=pEmail;
    }
    
    public String ValidarCorreo()
    {
         String mensaje="El correo no contiene @";
         for (int i = 0; i < email.length(); i++)
         {
            if(email.charAt(i)=='@')
            {
              mensaje="El correo si contiene @";
            }
        }
         return mensaje;
    }
    
}
