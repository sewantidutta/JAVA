package Multicasting;

import java.net.*;
import java.util.Scanner;
public class Sender {
   public static void main(String [] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       //creating multicasting socket at the sender side
       MulticastSocket ms = new MulticastSocket();
       //taking input group Ip from the terminal itself
       String group = args[0];
       //create Inet object using the Ip of group where the message has to be sent
       InetAddress ob = InetAddress.getByName(group);
       //taking in the message to send
       System.out.println("Enter a string : ");
       String str = sc.nextLine();
       byte[] b = str.getBytes();
       //creating datagram packet
       //with the argument (byte array , the size of the byte array , the Inet object of Ip of destination and Port)
       DatagramPacket to_send = new DatagramPacket(b, b.length,ob,4989);
       ms.send(to_send);
   }
}

