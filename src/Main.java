
import homeshop.Bill;
import homeshop.Fridge;
import homeshop.Television;
import miam.Aliment;
import miam.Four;

//import homeshop.Customer; 


/**
 *
 * @author tirde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Four grandFour = new Four(); 
       grandFour.capacite = 55 ; 
       grandFour.puissance = 260 ; 
       
       
       
       
       Aliment cake = new Aliment(); 
       cake.name = "cake aux fruits"; 
       cake.estCuit = false ; 
       cake.manger(); 
        System.out.println("");
         grandFour.cuire(cake);
        System.out.println("");
        cake.manger(); 
        
        
        
        
        Product cafe = new Product("Philips HD7886/61","Philip Senseo Quadrante, Noir -1 OU 2 tasses",79.99);
        Television tv = new Television("tv samsung ue49MU6292", "SMART TV LED INCUVREE 49",599,49,"Led"); 
        Fridge fridge = new Fridge ("BEKO TSE 1042 F ","Refigérateur BEKO 130L-Classe A+ - blanc ",189,130,false);
    /**    Customer customer = new Customer ("Juste Leblanc ","19 rue Germain Pilon, Paris"); 
        
        Bill bill = new Bill(customer);  
        bill.addProduct(cafe ,1); 
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        */
                
                
                
                
    }
    
}
