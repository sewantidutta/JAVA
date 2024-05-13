import java.util.Scanner;

public class scannerfn {
    public static void main(String[] args) {
        // creating scanner object which uses input feature System
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your Name:" + name);
        System.out.println("Enter Birth Year:");
        int year = sc.nextInt();
        System.out.println("Your Birth year:" + year);
        System.out.println("Enter your favorite letter:");
        char letter = sc.next().charAt(0);
        System.out.println("Your favorite letter:" + letter);
    }
}