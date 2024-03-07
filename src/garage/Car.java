
package garage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tirdea ana maria 
 */
public class Car extends Vehicule {
    
    private int door ; 
    private int literPer100km ; 
    private String motor ; 
    private List<String> options = new ArrayList<String>(); 
    
    
    
    public Car(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight, int door , int literPer100km , String motor, List<String> option) {
        super(modelName, description, manufacturer, year, color, speed, dimensions, weight);
    
      this.door = door ; 
      this.literPer100km = literPer100km ; 
      this.motor = motor ; 
      this.options = options ; 
      
    
    }
    
    
    public int getDoor(){
        return door ;
        
    }
    
    
    public int getLiterPer100km(){
        return literPer100km ; 
    }
    
    public String getMotor(){
        return motor ; 
        
    }
    
    public List<String> getOptions(){
        return options ; 
    }
    
    
    public void startHeadlight(){
        System.out.println("j'allume mes phares ");
    }


   public void openTruk(){
       System.out.println("J'ouvre mon coffre ");
   }

   
      @Override 
      public void start(){
          System.out.println("je suis "+ modelName + "je consomme "+ literPer100km + "l au 100km et je rrr! ");
          
      }
   
   
      
      @Override 
      public void stop(){
          System.out.println("je suis "+ modelName + "J'arrête mon moteur "+ motor );
      }
   
}


