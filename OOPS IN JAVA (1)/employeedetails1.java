import java.util.Scanner;

class Employee {
    int emp_id;
    String name;
    int salary;
    String designation;

    Employee(String Name) {
        name = Name;
        emp_id = 1156;
        salary = 24250;
        designation = "Software Analyst";
    }

    Employee(String Name, int Salary, String Desg) {
        name = Name;
        emp_id = 1289;
        salary = Salary;
        designation = Desg;
    }

    Employee() {
        name = "Temporary_Member";
        emp_id = 1000;
        salary = 1000;
        designation = "Client";
    }
}

public class employeedetails1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[3];
        System.out.println("Press E to save details of Executive Employee");
        System.out.println("Press F to save details of Fresher Employee");
        System.out.println("Press any other key for temporary employee");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the type of Employee: ");
            char type = sc.next().charAt(0);
            if (type == 'E') {
                System.out.println("Enter the salary of the employee:");
                String s = sc.next();
                int salary = Integer.parseInt(s);
                System.out.println("Enter the name of the employee:");
                String name = sc.next();
                System.out.println("Enter the designation of the employee:");
                String designation = sc.next();
                arr[i] = new Employee(name, salary, designation);
                System.out.println();
            } else if (type == 'F') {
                System.out.println("Enter the name of the employee:");
                String name = sc.next();
                arr[i] = new Employee(name);
                System.out.println();
            } else {
                arr[i] = new Employee();
                System.out.println();
            }
        }
        for (Employee e : arr) {
            System.out.println("name of employee : " + e.name);
            System.out.println("ID of employee : " + e.emp_id);
            System.out.println("Salary of employee : " + e.salary);
            System.out.println("Designation of the employee : " + e.designation);
            System.out.println();
        }
    }
}