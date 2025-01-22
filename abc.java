public class Employee {
    private String name;
    private int employeeId;
    private double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public void displayDetails() {
        System.out.println(this);
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicSalary);
    }
}

public class Manager extends Employee {
    private double petrolAllowance;
    private double foodAllowance;
    private double otherAllowance;

    public Manager(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
        this.petrolAllowance = 0.08 * basicSalary;
        this.foodAllowance = 0.13 * basicSalary;
        this.otherAllowance = 0.03 * basicSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", petrolAllowance=" + petrolAllowance +
                ", foodAllowance=" + foodAllowance +
                ", otherAllowance=" + otherAllowance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Petrol Allowance: " + petrolAllowance);
        System.out.println("Food Allowance: " + foodAllowance);
        System.out.println("Other Allowance: " + otherAllowance);
    }

    @Override
    public double calculateGrossSalary() {
        return super.getBasicSalary() + petrolAllowance + foodAllowance + otherAllowance;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * super.getBasicSalary());
    }
}

public class MarketingExecutive extends Employee {
    private int kilometersTravelled;
    private double tourAllowance;
    private final double telephoneAllowance = 1500;

    public MarketingExecutive(String name, int employeeId, double basicSalary, int kilometersTravelled) {
        super(name, employeeId, basicSalary);
        this.kilometersTravelled = kilometersTravelled;
        this.tourAllowance = kilometersTravelled * 5;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", kilometersTravelled=" + kilometersTravelled +
                ", tourAllowance=" + tourAllowance +
                ", telephoneAllowance=" + telephoneAllowance;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Kilometers Travelled: " + kilometersTravelled);
        System.out.println("Tour Allowance: " + tourAllowance);
        System.out.println("Telephone Allowance: " + telephoneAllowance);
    }

    @Override
    public double calculateGrossSalary() {
        return super.getBasicSalary() + tourAllowance + telephoneAllowance;
    }

    @Override
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * super.getBasicSalary());
    }
}

public class abc {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 1, 50000);
        MarketingExecutive executive = new MarketingExecutive("Jane Smith", 2, 45000, 100);

        showDetails(manager);
        System.out.println();
        showDetails(executive);
    }

    public static void showDetails(Employee employee) {
        employee.displayDetails();
        System.out.println("Gross Salary: " + employee.calculateGrossSalary());
        System.out.println("Net Salary: " + employee.calculateNetSalary());
    }
}
