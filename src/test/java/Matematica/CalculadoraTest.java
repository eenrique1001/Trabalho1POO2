/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ézio
 */
public class CalculadoraTest {
    
    private Calculadora n;
    private static float a;
    private static float b;
    private static float c;
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        CalculadoraTest.a = (float) 3.333;
        CalculadoraTest.b = (float) 6.666;
        CalculadoraTest.c = 0;
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("Processo finalizado");
    }
    
    @BeforeEach
    public void setUp() {
        n = new Calculadora();
        
    }
    
    @AfterEach
    public void tearDown() {
        n = null;
    }

    /**
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        float a = CalculadoraTest.a;
        float b = CalculadoraTest.b;
        float expResult = a + b;
        float result = n.soma(a, b);
        assertEquals(expResult, result, 0);
        fail("Soma inválida! O valor esperado era" + expResult);
    }

    /**
     * Test of subtrai method, of class Calculadora.
     */
    @Test
    public void testSubtrai() {
        System.out.println("subtrai");
        float a = CalculadoraTest.a;
        float b = CalculadoraTest.b;
        float expResult = a - b;
        float result = n.subtrai(a, b);
        assertEquals(expResult, result, 0);
        fail("Subtração inválida! O valor esperado era" + expResult);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        
    }

    /**
     * Test of ePrimo method, of class Calculadora.
     */
    @Test
    public void testEPrimo() {
        System.out.println("ePrimo");
        assertTrue(n.ePrimo(14533));
    }
    
    @Test
    public void testNaoEPrimo (){
        System.out.println("NaoEPrimo");
        assertTrue(n.ePrimo(100000));
    }
    
}
