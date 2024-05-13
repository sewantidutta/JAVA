import java.io.*;

public class calculator {
    public static void main(String[] args) {
        // takes variable 1
        int a = Integer.parseInt(args[0]);
        // takes variable 2
        int b = Integer.parseInt(args[2]);
        String ch = args[1];
        // perform arithematic ops based on the operator given in the expression
        switch (ch) {
            case "+":
                int sum = a + b;
                System.out.println(a + " + " + b + " = " + sum);
                break;
            case "-":
                int sub = a - b;
                System.out.println(a + " - " + b + " = " + sub);
                break;
            case "x":
                int mul = a * b;
                System.out.println(a + " * " + b + " = " + mul);
                break;
            case "/":
                double div = a / b;
                System.out.println(a + " / " + b + " = " + div);
                break;
            // default case
            default:
                System.out.println("Wrong Choice");
        }
    }
}