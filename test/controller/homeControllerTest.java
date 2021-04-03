/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.servlet.http.HttpServletRequest;
import models.Producto;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Sebastian Bermudez
 */
public class homeControllerTest {
    
    /**
     *
     */
    public homeControllerTest() {
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
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of home method, of class homeController.
     */
    @Test
    public void testHome() {
        System.out.println("home");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.home();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCliente method, of class homeController.
     */
    @Test
    public void testMostrarProd() {
        System.out.println("mostrarProd");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.mostrarProd();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarCliente method, of class homeController.
     */
    @Test
    public void testCargarProd() {
        System.out.println("cargarProd");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.cargarProd();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of agregarCliente method, of class homeController.
     */
    @Ignore("Error")
    public void testAgregarProd() {
        System.out.println("agregarProd");
        Producto prod = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.agregarProd(prod, result_2, status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actCliente method, of class homeController.
     */
    @Ignore("Error")
    public void testActProd() {
        System.out.println("actProd");
        Producto prod = null;
        BindingResult result_2 = null;
        SessionStatus status = null;
        homeController instance = new homeController();
        ModelAndView expResult = instance.actProd(prod, result_2, status);
        ModelAndView result = instance.actProd(prod, result_2, status);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of borrarCliente method, of class homeController.
     */
    @Ignore("Error")
    public void testBorrarProd() {
        System.out.println("borrarProd");
        HttpServletRequest request = null;
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.borrarProd(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cargarClientebyId method, of class homeController.
     */
    @Test
    public void testCargarProductobyId() {
        System.out.println("cargarProductobyId");
        int id = 0;
        homeController instance = new homeController();
        Producto expResult = null;
        Producto result = instance.cargarProductobyId(id);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarClientesxNombre method, of class homeController.
     */
    @Test
    public void testListarProdxNombre_0args() {
        System.out.println("listarProdxNombre");
        homeController instance = new homeController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listarProdxNombre();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
