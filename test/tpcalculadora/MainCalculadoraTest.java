/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario-Gustavo
 */
public class MainCalculadoraTest {
    MainCalculadora g = MainCalculadora.getInstance();
    
    public MainCalculadoraTest() {
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

    @Test
    public void testMain() {
		g.boton5.doClick();
                g.botonmas.doClick();
                g.boton5.doClick();
                g.botonigual.doClick();
              
                assertEquals(g.textResultado.getText(), "10");
                
    }
}