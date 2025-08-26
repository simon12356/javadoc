class Employee {
    String name; double baseSalary;
    Employee() { this("", 0.0); }
    Employee(String name, double baseSalary) { this.name = name; this.baseSalary = baseSalary; }
    void setDetails(String name, double baseSalary) { this.name = name; this.baseSalary = baseSalary; }
    void setDetails(String name) { this.name = name; }
    double calculateSalary() { return baseSalary; }
}

class Manager extends Employee {
    double bonus;
    Manager(String name, double baseSalary, double bonus) { super(name, baseSalary); this.bonus = bonus; }
    @Override double calculateSalary() { return baseSalary + bonus; }
}

class Clerk extends Employee {
    double daRate;
    Clerk(String name, double baseSalary, double daRate) { super(name, baseSalary); this.daRate = daRate; }
    @Override double calculateSalary() { return baseSalary * (1 + daRate); }
}

public class PayrollDemo {
    public static void main(String[] args) {
        System.out.println("Manager(Asha) Salary: " + new Manager("Asha", 60000, 15000).calculateSalary());
        System.out.println("Clerk(Ravi) Salary: " + new Clerk("Ravi", 30000, 0.12).calculateSalary());
    }
}
