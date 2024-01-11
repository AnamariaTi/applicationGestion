package homeshop; 

import java.util.Map;





/**
 *
 * @author tirdea ana maria 
 */
public class Bill {
    
   private  Customer customer ; 
   private Map<Product, Integer> products ;
   
   /***
    * Add a product whit a quantity in the bill 
    * @param product product to add 
    * @param quantity quantity of the product 
    */
   public void addProduct(Product product , Integer quantity){
       this.products.put(product, quantity); 
       
   }
    
   
   public Customer getCustomer(){
       return customer ; 
       
   }
    
   
   public Map<Product,Integer>getProducts(){
    return products ;    
   }
}

