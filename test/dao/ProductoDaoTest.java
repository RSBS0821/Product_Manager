/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebastian Bermudez
 */
public class ProductoDaoTest {
    
    /**
     *
     */
    public ProductoDaoTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of consultarClienteById method, of class ProductoDao.
     */
    @Test
    public void testConsultarProdById() {
        System.out.println("consultarProdById");
        int id = 0;
        ProductoDao instance = new ProductoDao();
        List expResult = null;
        List result = instance.consultarProdById(id);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class ProductoDao.
     */
    @Test
    public void testConsultarProdByNombre() {
        System.out.println("consultarProdByNombre");
        String nombre = "";
        ProductoDao instance = new ProductoDao();
        List expResult = null;
        List result = instance.consultarProdByNombre(nombre);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
