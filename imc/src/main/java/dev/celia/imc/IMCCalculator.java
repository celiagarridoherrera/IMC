package dev.celia.imc;

public class IMCCalculator {

    public double calculateIMC(Person person) {
        return person.getWeight() / Math.pow(person.getHeight(), 2);
    }
    public String getCategory (double imc) {
        if (imc < 16.00) {
            return "Delgadez severa";
        }else if (imc >= 16.00 && imc < 17.00) {
            return "Delgadez moderada";
        }else if (imc >=17.00 && imc < 18.50) {
            return "Delgadez leve";
        }else if (imc >= 18.50 && imc < 25.00) {
            return "Peso Normal";
        }else if (imc >= 25.00 && imc < 30.00) {
            return "Sobrepeso";
        }else if (imc >= 30.00 && imc < 35.00) {
            return "Obesidad leve";
        }else if (imc >=35.00 && imc < 40.00) {
            return "Obesidad moderada";
        }else {
            return "Obesidad mórbida";
        }
    }

}

