/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sebastian Bermudez
 */
@RunWith(value = Parameterized.class)

public class ProductoDaoParam2Test {
    private String nombre;
    private String expResult;

    /**
     *
     * @param nombre
     * @param expResult
     */
    public ProductoDaoParam2Test(String nombre, String expResult) {
        this.nombre = nombre;
        this.expResult = expResult;
    }
   
    /**
     *
     * @return
     */
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{"Ceftiofur",""});
        obj.add(new Object[]{"Oxitetraciclina",""});
        return obj;
    }
 
    /**
     * Test of consultarClienteByNombre method, of class ProductoDao.
     */
    @Test
    public void testConsultarProdByNombre() {
        System.out.println("consultarProdByNombre");
        //String nombre = "";
        ProductoDao instance = new ProductoDao();
        //List expResult = null;
        List result = instance.consultarProdByNombre(nombre);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
