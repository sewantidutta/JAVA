package UDP;

import java.util.Scanner;
import java.net.*;
import java.io.*;
public class pankajerver {
    public static void main(String[] aStrings) throws Exception{
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(4254);
        
        while(true) {
            byte []b = new byte[8096];
            DatagramPacket to_recieve = new DatagramPacket(b, b.length);
            ds.receive(to_recieve);
            String str = new String(to_recieve.getData());
            if(str.equals("end")) {
                break; 
            }
            System.out.println("client :"+str);

            String to_send = sc.nextLine();
            byte[] b2 = to_send.getBytes();
            DatagramPacket dp = new DatagramPacket(b2,b2.length,to_recieve.getAddress(),to_recieve.getPort());
            ds.send(dp);
            if(to_send.equals("end")) {
                break; 
            }
        }
        
        
    }
}