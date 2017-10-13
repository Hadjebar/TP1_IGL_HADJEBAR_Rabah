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
public class TP_IGL_Applivation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] tab = {5,0,45,2,6};
        
        tab = VecteurHelper.TriertVecteur(tab);
        
        System.out.println("tab1[0] = " + tab[4]);
    }
    
}
