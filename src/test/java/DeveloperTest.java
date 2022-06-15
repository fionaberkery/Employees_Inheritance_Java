import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tag", "JM423535", 25.500);
    }

    @Test
    public void developerHasName(){
        assertEquals("Tag", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("JM423535", developer.getNiNumber());
    }

    @Test
    public void developerHasASalary(){
        assertEquals(25.500, developer.getSalary(), 0.0);
    }

    @Test
    public void developersSalaryCanBeRaised(){
        double currentSalary = developer.getSalary();
        developer.raiseSalary(currentSalary);
        assertEquals(51, developer.getSalary(), 0.0);
    }

    @Test
    public void developerCanReceiveAPayBonus(){
        assertEquals("Your pay bonus is £25.5", developer.payBonus());
    }
}
