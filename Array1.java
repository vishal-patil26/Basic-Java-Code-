// Employee class definition
class Employee {
    private String name;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods for name and salary
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Override the toString method to return a formatted string for easy printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}


public class Array1 {
    public static void main(String[] args) {

        Employee[] emp = new Employee[5];

        
        emp[0] = new Employee("Vishal", 270000);
        emp[1] = new Employee("Prajyot", 230000);
        emp[2] = new Employee("Yash", 260000);
        emp[3] = new Employee("Ashif", 290000);
        emp[4] = new Employee("Pranav", 240000);

       
        for (Employee e : emp) {
            System.out.println(e);
        }
    }
}
