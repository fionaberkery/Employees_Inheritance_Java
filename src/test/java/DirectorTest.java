import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tanya", "JM645634", 80.500, "Tech & Design", 150.500);
    }

    @Test
    public void directorHasAName(){
        assertEquals("Tanya", director.getName());
    }

    @Test
    public void directorHasNiNimber(){
        assertEquals("JM645634", director.getNiNumber());
    }

    @Test
    public void directorHasASalary(){
        assertEquals(80.500, director.getSalary(), 0.0);
    }

    @Test
    public void directorHasADeptName(){
        assertEquals("Tech & Design", director.getDeptName());
    }

    @Test
    public void directorHasABudget(){
        assertEquals(150.500, director.getBudget(), 0.0);
    }

    @Test
    public void directorsSalaryCanBeRaised(){
        double currentSalary = director.getSalary();
        director.raiseSalary(currentSalary);
        assertEquals(161, director.getSalary(), 0.0);
    }

    @Test
    public void directorCanGetAPayBonus(){
        assertEquals("Your pay bonus is £80.5", director.payBonus());
    }

}
