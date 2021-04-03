package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Sebastian Bermudez
 */
@RunWith(value = Parameterized.class)

public class ProductoDaoParamTest {
    private int id;
    private String expResult;

    /**
     *
     * @param id
     * @param expResult
     */
    public ProductoDaoParamTest(int id, String expResult) {
        this.id = id;
        this.expResult = expResult;
    }
   
    /**
     *
     * @return
     */
    @Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{1,""});
        obj.add(new Object[]{2,""});
        return obj;
    }
 
    /**
     *
     */
    @Test
    public void testConsultarProdById() {
        System.out.println("consultarProdById");
        //int id = 0;
        ProductoDao instance = new ProductoDao();
        //String expResult = "";
        List result = instance.consultarProdById(id);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
