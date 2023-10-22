/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Matematica;

import java.util.ArrayList;
import java.util.Arrays;
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
    private static int a;
    private static int b;
    private static int c;
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        CalculadoraTest.a = 3;
        CalculadoraTest.b = 2;
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
        int a = CalculadoraTest.a;
        int b = CalculadoraTest.b;
        int expResult = a+b;
        int result = n.soma(a, b);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of subtrai method, of class Calculadora.
     */
    @Test
    public void testSubtrai() {
        System.out.println("subtrai");
        int a = CalculadoraTest.a;
        int b = CalculadoraTest.b;
        int expResult = a - b;
        int result = n.subtrai(a, b);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = CalculadoraTest.a;
        int b = CalculadoraTest.b;
        int notExpResult = CalculadoraTest.c;
        int result = n.multiplica(a, b);
        assertNotEquals(notExpResult, result, 0);

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
    
    @Test
    public void naoEAMesmaCalculadora(){
        Calculadora g = new Calculadora();
        assertNotSame(g, n);
    }

    /**
     * Test of fibonacci method, of class Calculadora.
     */
    @Test
    public void testFibonacci() {
        System.out.println("fibonacci");
        int m = 6;
        Iterable<Integer> expResult = new ArrayList<>(Arrays.asList(0,1, 1, 2, 3, 5));
        ArrayList<Integer> result = n.fibonacci(m);
        assertIterableEquals(expResult, result);
        
    }

    /**
     * Test of multiplos method, of class Calculadora.
     */
    @Test
    public void testMultiplos() {
        System.out.println("multiplos");
        int num = 3;
        int qntd = 5;
        int[] expResult = {0, 3, 6, 9, 12};
        int[] result = n.multiplos(num, qntd);
        assertArrayEquals(expResult, result);
    }
    
    
    
    
    
}
