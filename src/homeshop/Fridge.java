
package homeshop;

/**
 *
 * @author tirde
 */
public class Fridge extends Product {
    
    private int liter ; 
    private boolean freezer ; 
    
    
    public Fridge(String name, String description, double price) {
        super(name, description, price);

          this.liter = liter ; 
          this.freezer = freezer ; 

    }
    
    
    
    public int getLiter(){
        return liter ; 
        
    }
    
    public boolean getFreezer(){
        return freezer ; 
    }
    
    
       
}
