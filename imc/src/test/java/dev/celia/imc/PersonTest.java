package dev.celia.imc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.lang.annotation.Target;
import org.apereo.services.persondir.support.xml.om.Person;

public class PersonTest {
    @Test public void testIMC() {

        Person person = new Person(70.00, 1.75);
        double expectedIMC = 70.00 / Math.pow(1.75, 2);
        
        assertEquals(expectedIMC, person.calculateIMC, 0.01);
    }

}