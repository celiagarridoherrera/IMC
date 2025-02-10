package dev.celia.imc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {


    @Test
    void testIMCCalculate() {
        Person person = new Person(74.00, 1.68);
        IMCCalculator imcCalculator = new IMCCalculator();
        double expectedIMC = 74.00 / Math.pow(1.68, 2);
        
        assertEquals(expectedIMC, imcCalculator.calculateIMC(person), 0.01);
        
    }

    @Test
    void testGetCategory() {
        IMCCalculator imcCalculator = new IMCCalculator();
        
        assertEquals("Delgadez severa", imcCalculator.getCategory(15.00));
        assertEquals("Delgadez moderada", imcCalculator.getCategory(16.50));
        assertEquals("Delgadez leve", imcCalculator.getCategory(17.50));
        assertEquals("Normal", imcCalculator.getCategory(20.00));
        assertEquals("Sobrepeso", imcCalculator.getCategory(26.00));
        assertEquals("Obesidad leve", imcCalculator.getCategory(31.00));
        assertEquals("Obesidad moderada", imcCalculator.getCategory(37.00));
        assertEquals("Obesidad mórbida", imcCalculator.getCategory(42.00));
    }
        
    }
