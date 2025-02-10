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

}
