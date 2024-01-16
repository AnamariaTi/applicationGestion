
package miam;

/**
 *
 */
public class Aliment {
    
   public  String name ; 
   public  boolean estCuit ;   
    
    
    
    
    
    
    
    
    public void manger(){
        if(estCuit){
            System.out.println("Miam miam cet aliment : "+ name +"est bien cuit");
        }else{
            System.out.println("Beerk cet aliment : "+ name + "est cru !");
        }
    }
    
    
}
