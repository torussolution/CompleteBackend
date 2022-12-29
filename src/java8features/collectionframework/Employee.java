package java8features.collectionframework;

public class Employee {
    private String empId;
    private String empName;
    private float salary;


    public Employee(String empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
