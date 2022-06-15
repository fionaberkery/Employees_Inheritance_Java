import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Taylor", "JM9903747B", 40.500, "Tech");
    }

    @Test
    public void managerHasAName(){
        assertEquals("Taylor", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("JM9903747B", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(40.500, manager.getSalary(), 0.0);
    }

    @Test
    public void managerHasADept(){
        assertEquals("Tech", manager.getDeptName());
    }

    @Test
    public void managerSalaryCanBeRaised(){
        double currentSalary = manager.getSalary();
        manager.raiseSalary(currentSalary);
        assertEquals(81, manager.getSalary(), 0.0);
    }

    @Test
    public void managerCanReceivePayBonus(){
        assertEquals("Your pay bonus is £40.5", manager.payBonus());

    }

}
