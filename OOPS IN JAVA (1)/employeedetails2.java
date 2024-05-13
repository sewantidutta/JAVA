import java.util.Scanner;

class Employee {
    int emp_id;
    String name;
    int salary;
    String designation;
    static int emp_count = 0;
    static final String company = "TCS";

    Employee(String n) {
        name = n;
        emp_count++;
        emp_id = emp_count;
        salary = 20000;
        designation = "Software Developer";
    }

    static void dispComp() {
        System.out.println("Company name: " + company);
    }

    // remove comment to get the compilation error for updating the final keyword
    /*
     * static void updateComp(String s) {
     * company = s;
     * }
     */
    // Accessor method for emp_count
    static int getEmpCount() {
        return emp_count;
    }

    Employee(String n, int s, String d) {
        emp_count++;
        emp_id = emp_count;
        name = n;
        salary = s;
        designation = d;
    }

    Employee() {
        emp_count++;
        emp_id = emp_count;
        name = "temp_employee";
        salary = 10000;
        designation = "UI designer";
    }

    static void dispcount() {
        System.out.println("number of employee: " + emp_count);
    }

    int countemployee() {
        return emp_count;
    }

    void salInc(int b) {
        salary += b;
    }

    // Updated the salary increment method
    void salInc(int b, int p) {
        salary += salary * p / 100 + b;
    }

    // Compare the salary of 2 employee objects and return one with highest salary
    static Employee cmp(Employee a, Employee b) {
        if (b.salary > a.salary) {
            return b;
        }
        return a;
    }

    static void display(Employee e) {
        System.out.println("name of employee: " + e.name);
        System.out.println("ID of employee: " + e.emp_id);
        System.out.println("Salary of employee: " + e.salary);
        System.out.println("Designation of the employee: " + e.designation);
    }
}

public class employeedetails2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[3];
        System.out.println("enter E to enter details of executive employee");
        System.out.println("enter F to enter details of fresher employee");
        System.out.println("enter any other for temporary employee");
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the type of employee: ");
            char type = sc.next().charAt(0);
            if (type == 'E') {
                System.out.println("Enter the salary of the employee");
                int salary = sc.nextInt();
                System.out.println("Enter the name of the employee");
                String name = sc.next();
                System.out.println("Enter the designation of the employee");
                String designation = sc.next();
                arr[i] = new Employee(name, salary, designation);
            } else if (type == 'F') {
                System.out.println("Enter the name of the employee:");
                String name = sc.next();
                arr[i] = new Employee(name);
            } else {
                arr[i] = new Employee();
            }
        }
        for (Employee e : arr) {
            Employee.display(e);
            System.out.println();
        }
        Employee.dispcount();
        Employee mx = Employee.cmp(arr[0], arr[1]);
        System.out.println("Employee with the highest salary among the first 2 is: " + mx.name);
        Employee.dispComp();
        for (int i = 0; i < 3; i++) {
            if (arr[i].designation.equals("UI designer")) {
                arr[i].salInc(15000, 10);
            } else if (arr[i].designation.equals("Software Developer")) {
                arr[i].salInc(15000);
            }
        }
        System.out.println("after updating the salary");
        System.out.println();
        for (Employee e : arr) {
            Employee.display(e);
            System.out.println();
        }
        // trying to update Company which is defined final
        // Employee.updateComp("Cognizant");
    }
}