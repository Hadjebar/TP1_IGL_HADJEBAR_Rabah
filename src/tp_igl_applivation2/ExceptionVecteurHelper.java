/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_igl_applivation2;

/**
 *
 * @author Hadjebar Rabah
 */
public class ExceptionVecteurHelper extends Exception {
    
    /**
     * Le constructeur de cette la classe exception revoie un message d'alert pour l'utilisateur
     * @param message le message affiché à l'utilisateur
     */
    
    public ExceptionVecteurHelper(String message){
        System.out.println(message);
    }
    
}
