package UDP;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class server {
   public static void main(String[] args) throws Exception {

       //CREATING SOCKET
       //while creating datagram socket for server we give a port number
       DatagramSocket ds = new DatagramSocket(4898);

       //RECEIVING PART
       byte[] data = new byte[1024];
       //blank datagram packet
       DatagramPacket dp = new DatagramPacket(data,data.length);
       //receiving datagram packet using datagram socket
       ds.receive(dp);
       //converting datagram packet to sting
       String str = new String(dp.getData());
       //string.trim removes the gap and converting to integer
       int num=Integer.parseInt(str.trim());

       //CALCULATION PART
       //calculation done by server (calculates the square)
       int res=num*num;
	 System.out.println("Processing");


       //SENDING PART
       //converting calculated result to bytes
       byte[] sendData = String.valueOf(res).getBytes();
       //for sending purpose I need 4 things in my datagram packet
       // that is DatagramPacket(byte array, byte array size, ip of the receiver, port)
       //in this case we are sending to ourselves so we use local host
       InetAddress IP = InetAddress.getLocalHost();
       //we got dp and from that we extract the port number dp.getPort
       DatagramPacket to_send = new DatagramPacket(sendData,sendData.length,IP,dp.getPort());
       //send via datagramsocket
       ds.send(to_send);
      
   }
}



