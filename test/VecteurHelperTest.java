/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import tp_igl_applivation2.ExceptionVecteurHelper;
import tp_igl_applivation2.VecteurHelper;

/**
 * La classe des Tests Unitaires <b> JUnit <b>
 * @author Hadjebar Rabah
 */
public class VecteurHelperTest {
    
    public VecteurHelperTest() {
    }
    

    /**
     * Tester la méthode TriertVecteur, de la classe VecteurHelper.
     */
    @Test
    public void testTriertVecteur() {
        System.out.println("TriertVecteur");
        int[] vecteur = {5,4,2,6};
        int[] result = VecteurHelper.TriertVecteur(vecteur);
    }

    /**
     * Tester la méthode SommeDeuxVecteurs, de la classe VecteurHelper.
     */
    @Test
    public void testSommeDeuxVecteurs() throws Exception {
        System.out.println("SommeDeuxVecteurs");
        //On prend deux vecteurs aleatoire
        int[] vec1 = {2,4,9};
        int[] vec2 = {6,8,7};
        int[] result = VecteurHelper.SommeDeuxVecteurs(vec1, vec2);
    }

    /**
     * Tester la méthode InverserVecteur, de la classe VecteurHelper.
     */
    @Test
    public void testInverserVecteur() {
        System.out.println("InverserVecteur");
        int[] vecteur = {6,9,7,2};
        int[] result = VecteurHelper.InverserVecteur(vecteur);
    }

    /**
     * Tester la méthode MaxMinVecteur, de la classe VecteurHelper.
     */
    @Test
    public void testMaxMinVecteur() throws Exception {
        System.out.println("MaxMinVecteur");
        VecteurHelper instance = new VecteurHelper();
        instance.MaxMinVecteur();
    }

    /**
     * Tester la méthode GetMax, de la classe VecteurHelper.
     */
    @Test
    public void testGetMax() throws ExceptionVecteurHelper {
        System.out.println("getMax");
        int[] tab = {5,2,6};
        VecteurHelper instance = new VecteurHelper(tab);
        int expResult = 6;
        int result = instance.getMax();
        assertEquals(expResult, result);
    }

    /**
     * Tester la méthode GetMin, de la classe VecteurHelper.
     */
    @Test
    public void testGetMin() throws ExceptionVecteurHelper {
        System.out.println("getMin");
        int[] tab = {5,2,6};
        VecteurHelper instance = new VecteurHelper(tab);
        int expResult = 2;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Tester la méthode MultiplicationFonction, de la classe VecteurHelper.
     */
    @Test
    public void testMultiplicationFonction() throws ExceptionVecteurHelper {
        System.out.println("MultiplicationFonction");
        int n = 2;
        int[] tab = {4,6,1};
        VecteurHelper instance = new VecteurHelper(tab);
        instance.MultiplicationFonction(n);
    }
    
}
