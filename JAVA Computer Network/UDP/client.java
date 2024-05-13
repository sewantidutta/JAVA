package UDP;

import java.net.*;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.util.Scanner;

public class client {
   public static void main(String args[]) throws Exception{

       //CREATING SOCKET
       //here we need datagram socket but here we have not mentioned the portnumber
       //whatever the port number available it is assigned by the os
       DatagramSocket ds = new DatagramSocket();
       //enter any value to get the square of it

       //TAKING INPUT FROM THE USER (NUMBER TO BE SQUARED)
       System.out.println("enter the number");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();

       //SENDING PART
       //byte array format
       //converted into string and then converted to bytes
       byte[] b = String.valueOf(i).getBytes();
       InetAddress IP = InetAddress.getLocalHost();
       //whenever we send we need 4 things in out datagram packet those are :
       // ((byte array),(length of the packet), (IP of the server), (port of the server))
       DatagramPacket dp = new DatagramPacket(b, b.length,IP,4898);
       ds.send(dp);

       //RECEIVING PART
       byte[] data = new byte[1024];
       //for receiving the created datagram packet while creating we need 2 things
       //that is the packet and the length of the packet
       DatagramPacket to_receive =new DatagramPacket(data, data.length);
       //receiving using the datagram socket
       ds.receive(to_receive);
       //converting received datagramPacket to the string
       String str = new String(to_receive.getData());
       //if we get error using dp.getData() then we can use :
       //String str = new String(incoming.getData(),0,incoming.getLength());
       System.out.println("Number : "+ str);
   }
}
/*
   Remember
   at the Transport layer data packets are called datagram or datagramPackets
*/



