import java.io.IOException;
import java.util.Scanner;

class printer {
    static void print(int arr[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter 10 values : ");
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] >= 100)
                throw new IOException();
            System.out.println("Please enter 2 index to divide element at that Index : ");
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();
            int ans = arr[idx1] / arr[idx2];
            System.out
                    .println("dividing element at index " + idx1 + " by element at index " + idx2 + "we get = " + ans);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCHES OUT OF BOUNDS EXCEPTION " + e);
        } catch (ArithmeticException e) {
            System.out.println("CATCHES ARITHMETIC EXCEPTION " + e);
        } finally {
            System.out.println("finally will always be executed ");
        }
        System.out.println("size of the array is = " + 10);
    }
}

public class exceptionexample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        printer.print(arr);
    }
}
/*
 * TO TEST ARRAY OUT OF BOUNDS EXCEPTION I/P
 * 1 2 3 4 5 6 7 8 9 0
 * 11 12
 * TO TEST ARITHMETIC EXCEPTION I/P
 * 1 2 3 4 5 6 7 8 9 0
 * 1 9
 * TO TEST UNHANDLED EXCEPTION I/P
 * a 2 3 4 5 6 7 8 9 0
 * TO TEST THROWS IO EXCEPTION I/P
 * 100 1 2 3 4 5 6 7 8 10
 */