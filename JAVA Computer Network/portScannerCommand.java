import java.io.*;
import java.net.Socket;
import java.util.*;
public class portScannerCommand {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the starting port number : ");
       int start = sc.nextInt();
       System.out.println("Enter the ending port number :");
       int end = sc.nextInt();
       int count = 0;
       System.out.println("..............");
       for(int i = start; i <= end; i++) {
          
           try {
    //we have created socket object s using localhost and the port
   //if port is not available exception occurs 
  //the catch block catches the exception object and prints the busy port
               Socket s = new Socket("localhost",i);
               System.out.println("Port " + i +" is available");
               count++;
           }
           catch(Exception e) {
              // System.out.println("Port " + i + " is busy");
           }
       }
       System.out.println("..............");
       System.out.println("Number of Available port = " + count);
   }
}


