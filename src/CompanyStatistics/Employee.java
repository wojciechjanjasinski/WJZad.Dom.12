package CompanyStatistics;

public class Employee {
    private String firstName;
    private String lastName;
    private double pesel;
    private String department;
    private double salary;

    public Employee(String firstName, String lastName, double pesel, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPesel() {
        return pesel;
    }

    public void setPesel(double pesel) {
        this.pesel = pesel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel=" + pesel +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
