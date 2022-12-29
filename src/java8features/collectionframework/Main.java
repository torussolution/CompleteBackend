package java8features.collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Employee> employees = new ArrayList<>();

    public static int insertEmployee(Employee obj)
    {
        if(!employees.isEmpty()) {
            for (Employee emp : employees
            ) {
                if (emp.getEmpId().equalsIgnoreCase(obj.getEmpId())) {
                    return 0;
                }
            }
            employees.add(obj);
        }
        else {
            employees.add(obj);
        }
        return -1;
    }
    public static int checkListSize()
    {
        return employees.size();
    }
    public static Employee getEmployee(int index)
    {
        return  employees.get(index);
    }
    public static Employee getEmployee(String name)
    {
        Employee employee = null;
        for (Employee emp:employees
             ) {
            if(emp.getEmpName().equalsIgnoreCase(name))
            {
                employee = emp;
            }
        }
        return employee;
    }
    public  static void updateEmployee(Employee obj,int index)
    {
        employees.set(index,obj);
    }
    public static void removeEmployee(int index)
    {
        employees.remove(index);
    }
    public static void removeEmployee(Employee obj)
    {
        employees.remove(obj);
    }

    public static void removeEmployee(String empId)
    {
//        for (Employee emp:employees
//        ) {
//            if(emp.getEmpId().equalsIgnoreCase(empId))
//            {
//                employees.remove(empId);
//            }
//        }
        employees.removeIf(employee -> employee.getEmpId().equalsIgnoreCase(empId));
    }
    public static void printData()
    {
        System.out.println("Employee Data is : ");
        employees.forEach(data-> System.out.print(data));
    }
    public static void main(String[] args) {
        Employee emp = null;
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice .....");
        System.out.println("1.insertion,2.getEmployeeByIndex,3.getEmployeeByCondition\n4.updateEmployee,5.removeEmployeeByIndex," +
                "6.removeEmployeeByObject\n7.removeEmployeeByCondition,8.List size,9.Print data");
        while (true) {
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter empId,enter name,enter salary");
                    String name, empId;
                    float salary;
                    empId = scan.next();
                    name = scan.next();
                    salary = scan.nextFloat();
                    emp = new Employee(empId, name, salary);
                    insertEmployee(emp);
                    printData();
                    break;
                }
                case 2: {
                    System.out.println("Enter index, to print emp data : ");
                    int index = scan.nextInt();
                    System.out.println(getEmployee(index));
                    printData();
                    break;
                }
                case 3: {
                    System.out.println("Enter name, to print emp data : ");
                    String name = scan.next();
                    System.out.println(getEmployee(name));
                    printData();
                    break;
                }
                case 4: {
                    System.out.println("Enter index to update data : ");
                    int index = scan.nextInt();
                    System.out.println(getEmployee(index));
                    System.out.println("Enter empId,enter name,enter salary");
                    String name, empId;
                    float salary;
                    empId = scan.next();
                    name = scan.next();
                    salary = scan.nextFloat();
                    emp = new Employee(empId, name, salary);
                    updateEmployee(emp, index);
                    printData();
                    break;
                }
                case 5: {
                    System.out.println("Enter index to remove data : ");
                    int index = scan.nextInt();
                    removeEmployee(index);
                    printData();
                    break;
                }
                case 6: {
                    removeEmployee(employees.get(1));
                    printData();
                    break;
                }
                case 7: {
                    System.out.println("Enter empId to remove employee data");
                    String empId;
                    empId = scan.next();
                    removeEmployee(empId);
                    printData();
                    break;
                }
                case 8:
                {
                    System.out.println("num of employees on list : "+checkListSize());
                }
                case 9:
                {
                    printData();
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }

                case 100: {
                    System.exit(0);
                }
            }
        }
    }
}
