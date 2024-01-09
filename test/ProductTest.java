

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tirdea ana maria 
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of look method, of class Product.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        Product instance = new Product();
        instance.look();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buy method, of class Product.
     */
    @Test
    public void testBuy() {
        System.out.println("buy");
        Bill bill = null;
        Integer quantity = null;
        Product instance = new Product();
        instance.buy(bill, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
