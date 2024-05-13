import java.io.IOException;
import java.util.Scanner;

class MyException extends Exception {
    public String toString() {
        return "Wrong password";
    }
}

class Checker {
    static void check(String userName, int password) throws IOException {
        try {
            if (userName.equals("admin") && password == 12345) {
                System.out.println("You are now logged in as: " + userName);
            } else {
                throw new MyException();
            }
            if (password > 12345) {
                throw new IOException();
            }
        } catch (MyException e) {
            System.out.println("Please enter correct password: " + e);
        } finally {
            System.out.println("Finally block always printed");
        }
        System.out.println("Username = " + userName + ", Password = " + password);
    }
}

public class exceptionOWN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        int password;
        System.out.println("Enter the Username: ");
        userName = sc.next();
        System.out.println("Enter the Password: ");
        password = sc.nextInt();
        try {
            Checker.check(userName, password);
        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e);
        }
    }
}