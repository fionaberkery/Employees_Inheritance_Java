package staff.management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, Double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }

    public String payBonus(){
        double salary = getSalary();
        double bonus = (salary * 0.02) * 100;
        return "Your pay bonus is £" + bonus;
    }
}
