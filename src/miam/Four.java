
package miam;

/**
 *
 * @author tirdea ana maria 
 */
public class Four {
    
    public  int puissance ; 
     public int capacite ; 
    
    /**
     *
     * @param aliment
     */
    public void cuire(Aliment aliment){
         System.out.println("je suis un aliment"+ aliment.name);
         System.out.println("avec ma capacite de "+ capacite + " litres ");
         System.out.println("et ma puissance de "+ puissance + " degrés ");
         aliment.estCuit = true ; 
     }
     
     
}
