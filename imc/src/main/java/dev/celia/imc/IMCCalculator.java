package dev.celia.imc;

public class IMCCalculator {

    public double calculateIMC(Person person) {
        return person.getWeight() / Math.pow(person.getHeight(), 2);
    }

}
