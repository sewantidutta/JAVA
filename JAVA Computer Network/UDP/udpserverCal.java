package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class udpserverCal {
    public static void main(String[] aStrings) throws Exception{
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(5954);
        
        while(true) {
            byte []b = new byte[1024];
            DatagramPacket to_recieve = new DatagramPacket(b, b.length);
            ds.receive(to_recieve);
            String str = new String(to_recieve.getData());
            if(str.equals("end")) {
                break; 
            }
            System.out.println("client :"+str);

            int num = Integer.parseInt(str.trim());
            num *= num;
            String to_send = String.valueOf(num);
            byte[] b2 = to_send.getBytes();
            DatagramPacket dp = new DatagramPacket(b2,b2.length,to_recieve.getAddress(),to_recieve.getPort());
            ds.send(dp);
            if(to_send.equals("end")) {
                break; 
            }
        }
        
        
    }
}