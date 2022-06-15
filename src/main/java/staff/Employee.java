package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double salary){
        this.salary = salary * 2;
    }

    public String payBonus(){
        double bonus = (this.salary * 0.01) * 100;
        return "Your pay bonus is £" + bonus;
    }

}
