public class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double HRA;
    private double medical;
    private double PF;
    private static double PT = 200.0; // Initialized PT to a default value (Professional Tax)
    private double netSalary;
    private double grossSalary;

    // Default Constructor (Optional, as Java provides a default constructor if you don't define one)
    public Employee() {
    }

    // Getters
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }

    public double getHRA() {
        return this.HRA;
    }

    public double getMedical() {
        return this.medical;
    }

    public double getPF() {
        return this.PF;
    }

    public static double getPT() {
        return PT; // PT is static, so no "this" keyword
    }

    public double getNetSalary() {
        return this.netSalary;
    }

    public double getGrossSalary() {
        return this.grossSalary;
    }

    // Setters
    public void setEmployeeId(int empId) {
        this.employeeId = empId;
    }

    public void setEmployeeName(String empName) {
        this.employeeName = empName;
    }

    public void setBasicSalary(double basicSal) {
        this.basicSalary = basicSal;
    }

    public void setHRA(double hra) {
        this.HRA = hra;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }

    public void setPF(double pf) {
        this.PF = pf;
    }

    public void calculateGrossSalary() {
        this.grossSalary = this.basicSalary + this.HRA + this.medical;
    }

    public void calculateNetSalary() {
        this.netSalary = this.grossSalary - (this.PF + PT);
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName +
                ", Basic Salary: " + basicSalary + ", HRA: " + HRA +
                ", Medical: " + medical + ", PF: " + PF +
                ", Gross Salary: " + grossSalary + ", Net Salary: " + netSalary;
    }
}
