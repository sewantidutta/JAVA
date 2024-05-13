package Multicasting;

import java.util.Scanner;
import java.net.*;
public class receiver1 {
   public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       //creating multicast socket for the receiver with the port number
       MulticastSocket ms = new MulticastSocket(new InetSocketAddress("225.4.5.6", 4989));
       //taking the group Ip address
       String group = "225.4.5.6";
       //receiver joins the group with the group Ip Inet object
       //so we create the Inet address object of the group IP
       InetAddress ob = InetAddress.getByName(group);
       //joining the group
       ms.joinGroup(ob);
       byte[] b = new byte[1024];
       DatagramPacket to_receive = new DatagramPacket(b, b.length);
       //receiving the message
       ms.receive(to_receive);
       //printing message
       String message = new String(to_receive.getData());
       System.out.println("The message is : " +message);
       //leaving the group using the InetAddress Object
       ms.leaveGroup(ob);
   }
}
/* same as students join group cse2025b
   and teacher aka the sender or the broadcaster sends the mail without joining the group
*/
