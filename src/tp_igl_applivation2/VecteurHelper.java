package tp_igl_applivation2;

/**
 * La classe VecteurHelper contient un ensemble de méthode sur les vecteurs
 * @author Hadjebar Rabah
 */
public class VecteurHelper {
    private int[] vecteur ;
    private int max , min ;
    
    /**
     * Constructeur sans arguments initialise vecteur à null et max, min à 0  ;
     */
    public VecteurHelper(){
       vecteur = null ; 
       max = 0 ; 
       min = 0 ;
    }
    
    /**
     * Constructeur du Vecteur
     * @param vecteur  pour initiliser le vecteur cree 
     */
    public VecteurHelper(int[] vec ) throws ExceptionVecteurHelper{
        this.vecteur = vec; 
        MaxMinVecteur();
    }
 
    /**
     * Cette méthode trie le vecteur selon l'ordre croissant de ces valeurs
     * @param vecteur comme vecteur à tier
     * @return le vecteur lui mm mais trier
     * <br>  
     * <b> Exemple </b>
     * <pre>
     * 
     *      soit le vecteur : vec[5] = [12,3,5,4,1]
     *      TrierVecteur(vecteur) nous donne : vec[5]=[1,3,4,5,12]. 
     *   
     * </pre>
     */
    static public int[] TriertVecteur(int[] vecteur){
        int i, j, cle;
        
        for (i = 1; i < vecteur.length; i++) {
            cle = vecteur[i];
            j = i;
            while ((j >= 1) && (vecteur[j - 1] > cle)) {
                vecteur[j]  = vecteur[j - 1] ;
                j = j - 1;
            }
            vecteur[j] = cle;
        }
        
        return vecteur ;
    }
    
    /**
     *  Cette méthode calcul la somme de deux Vecteurs
     * @param vec1 le premier vecteur
     * @param vec2 le deuxième vecteur
     * @return un vecteur 
     * @throws ExceptionVecteurHelper si les deux vecteurs sont de taille différentes 
     */
    static public int[] SommeDeuxVecteurs(int[] vec1 , int[] vec2) throws ExceptionVecteurHelper{
        
        int[] vec = null;
        
        if(vec1.length == vec2.length ){
            vec = new int[vec1.length];
            for(int i = 0 ; i < vec1.length ; i++){
                vec[i] = vec1[i] + vec2[i];
            }
        }
        else{
            throw new ExceptionVecteurHelper("les deux vecteurs sont de taille différent");
        }
        return vec ;
    }
    
    /**
     * Cette méthode permet d'inverser les éléments d'un vecteur
     * @param vecteur le vecteur à inverser
     * @return le vecteur inversé
     */
    static public int[] InverserVecteur(int[] vecteur){
        
        int[] vecInv = new int[vecteur.length];
        for(int i = 0 ; i < vecteur.length ; i++){
            vecInv[i] = vecteur[vecteur.length - i - 1 ] ;
        }
        
        return vecInv ;
    }
    
    /**
     * Cette méthode calcul le max et le min du vecteur
     * @throws ExceptionVecteurHelper si le vecteur est null
     */
    public void MaxMinVecteur() throws ExceptionVecteurHelper{
        if(vecteur != null){
            max = vecteur[0];
            min = vecteur[0];
            
            for(int i = 1 ; i < vecteur.length ; i++){
                if(vecteur[i] < min) min = vecteur[i];
                if(vecteur[i] > max) max = vecteur[i];
            }
        }
        else throw new ExceptionVecteurHelper("le vecteur est null");
    }
    
    /**
     * 
     * @return le max du vecteur
     */
    public int getMax(){
        return max;
    }
    /**
     * 
     * @return le min du vecteur 
     */
    public int getMin(){
        return min;
    }
    
    /**
     * 
     * @return le vecteur 
     */
    public int[] getVecteur(){
        return vecteur ;
    }
    
    /**
     *  Cette méthode nous permet de multiplier tous 
     *  les cases du vecteur par un entier
     * @param n C'est l'entier 
     */
    public void MultiplicationFonction(int n){
        for (int i = 0 ; i < vecteur.length ; i++){ 
            vecteur[i] = vecteur[i] * n ;
        }
    }
}
