import java.util.*;
import java.net.InetAddress;
import java.net.Socket;
import java.io.*;
public class pingCommand {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the domain name to ping :");
       String domain = sc.next();
       try {
           InetAddress Ip = InetAddress.getByName(domain);
           //isReachable helps to ping and Identify whether the given instance of InetAddress having name and Ip is reachable]
           System.out.println(Ip.isReachable(500)? "Host is reachable" : "Host is NOT reachable");
       } catch(Exception e) {
           System.out.println(e);
       }
   }   
}
