import java.io.*;
import java.util.*;
import java.net.*;
public class printRemoteIp {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
           //getByName helps to ping whatever address we want by name
           InetAddress getIp1 = InetAddress.getByName("bppimt.ac.in");
           System.out.println("Ip address is = "+getIp1.getHostAddress());
           InetAddress getIp2 = InetAddress.getByName("bppimt.com");
           System.out.println("Ip address is = "+getIp2.getHostAddress());
          
       } catch(Exception e) {
           System.out.println(e);
       }
   }
}
