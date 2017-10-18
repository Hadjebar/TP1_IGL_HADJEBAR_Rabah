/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tp_igl_applivation2.VecteurHelper;

/**
 * La classe des Tests Unitaires <b> JUnit <b>
 * @author Hadjebar Rabah
 */
public class VecteurHelperTest {
    
    public VecteurHelperTest() {
    }
    

    /**
     * Testet la méthode TriertVecteur, de la classe VecteurHelper.
     */
    @Test
    public void testTriertVecteur() {
        System.out.println("TriertVecteur");
        int[] vecteur = {5,4,2,6};
        int[] result = VecteurHelper.TriertVecteur(vecteur);
    }

    
}
