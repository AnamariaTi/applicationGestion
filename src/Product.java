
/**
 *
 * @author tirdea ana maria
 */
public class Product {
    
    private String name ; 
    private String description ; 
    private double price ; 
    
    
    public Product(String name, String description ,double price ){
        this.name = name ; 
        this.description = description ; 
        this.price = price ; 
    }
    
    
     public String getName(){
        return name ; 
    }
    
     public String getDescription(){
        return description; 
    }
            
     public double  getPrice(){
        return price ;
   }
    
     public void setPrice(double price){
         this.price = price; 
     }
   
   
   
    /**
     * add the product to a bill 
     */
    public void look(){
        System.out.println(String.format(name + " : "+ price + "%n" + description));
    }
 
    /***
     * Add the product to a bill 
     * @param bill the concerned bill 
     * @param quantity the quantity to add 
     */
    public void buy(Bill bill , Integer quantity){
        
    }
    
    
    
    
    
}
