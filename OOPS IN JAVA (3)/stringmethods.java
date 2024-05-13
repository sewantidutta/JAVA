import java.util.Scanner;

public class stringmethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.next();
        String s = new String(userInput);
        System.out.println("Character at 3 :" + s.charAt(3));
        System.out.println("comparing with mango:" + s.compareTo("Mango"));
        System.out.println("checking equals with apple =:" + s.equals("Apple"));
        System.out.println("checking equals with this is a cat :" + s.equalsIgnoreCase("this is a cat"));
        System.out.println("Finding index of a :" + s.indexOf('a'));
        System.out.println("length of s :" + s.length());
        System.out.println("Substring of the string starting from 2nd index:" + s.substring(2));
        char[] arr = s.toCharArray();
        System.out.println("first letter of character array :" + arr[0]);
        String temp = s.toLowerCase();
        System.out.println("converting to Lower case :" + temp);
        temp = s.toUpperCase();
        System.out.println("converting to Upper case :" + temp);
        // Returns the string representation of int s.
        temp = String.valueOf(s);
        System.out.println("string representation of s :" + temp);
        int number = 10;
        String str = String.valueOf(number);
        System.out.println("string representation of number :" + str);
        String str2 = str.toString();
        System.out.println("converting to string using toString: " +str2);
    }
}
// charAt(),compareTo(),equals(),equalsIgnoreCase(),indexOf(),length(),substring(),toCharArray(),toLowerCase(),c,toUpperCase(),trim(),valueOf();*/