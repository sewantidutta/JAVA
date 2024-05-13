import java.util.*;
import java.net.*;
import java.io.*;
public class printOwnIp {
   public static void main(String args[]) {
       try {
           //it gets the local host
           //The getLocalHost() method of Java InetAddress class returns the instance of InetAddress containing local host name and address.
           InetAddress IP = InetAddress.getLocalHost();
           //to get the host Ip we use get local host we use IP.getHostAddress()
           System.out.println("Ip address of my system is " + IP.getHostAddress());
       }//incase some error occurs try and catch is used
       catch(Exception e) {   
           System.out.println(e);
       }
   } 
}
