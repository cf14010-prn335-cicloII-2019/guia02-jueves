/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.occ.edu.sv.ingenieria.prn335.controller.guia02;

import javax.persistence.EntityTransaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ues.occ.edu.sv.ingenieria.prn335.entity.guia02.Genero;

/**
 *
 * @author CF14010
 */
public class GeneroBeanTest {
    
    public GeneroBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of iniciarEM method, of class GeneroBean.
     */
    @Test
    public void testIniciarEM() {
        System.out.println("iniciarEM");
        GeneroBean instance = new GeneroBean();
        instance.iniciarEM();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTx method, of class GeneroBean.
     */
    @Test
    public void testGetTx() {
        System.out.println("getTx");
        GeneroBean instance = new GeneroBean();
        EntityTransaction expResult = null;
        EntityTransaction result = instance.getTx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearGenero method, of class GeneroBean.
     */
    @Test
    public void testCrearGenero() {
        System.out.println("crearGenero");
        Genero g = null;
        GeneroBean instance = new GeneroBean();
        instance.crearGenero(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarGenero method, of class GeneroBean.
     */
    @Test
    public void testModificarGenero() {
        System.out.println("modificarGenero");
        Genero g = null;
        GeneroBean instance = new GeneroBean();
        instance.modificarGenero(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generosFiltrados method, of class GeneroBean.
     */
    @Test
    public void testGenerosFiltrados() {
        System.out.println("generosFiltrados");
        String Generos = "drama comedia romance acción terror musical horror ficción guerra western\n" +
"crimen psicológico suspenso noir blanco&negro biográfico";
        GeneroBean instance = new GeneroBean();
        int expResult = 0;
        int result = instance.generosFiltrados(Generos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
