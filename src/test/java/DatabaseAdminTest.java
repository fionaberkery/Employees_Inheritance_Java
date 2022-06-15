import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Tim", "JM534645", 20.500);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Tim", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminNameCanBeChanged(){
        databaseAdmin.setName("Tom");
        assertEquals("Tom", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals("JM534645", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(20.500, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void databaseAdminSalaryCanBeRaised(){
        double currentSalary = databaseAdmin.getSalary();
        databaseAdmin.raiseSalary(currentSalary);
        assertEquals(41, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void databaseAdminCanReceivePayBonus(){
        assertEquals("Your pay bonus is £20.5", databaseAdmin.payBonus());
    }


}
