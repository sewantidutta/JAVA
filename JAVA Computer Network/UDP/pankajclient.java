package UDP;

import java.util.Scanner;
import java.net.*;
import java.io.IOException;
public class pankajclient {
    public static void main(String []args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(true) {
            
            
            String to_send = sc.nextLine();
            DatagramSocket ds = new DatagramSocket();
            byte []b = to_send.getBytes();
            InetAddress adr = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(b,b.length,adr,4254);
            ds.send(dp);
            if(to_send.equals("end")) {
                break;
            }

            byte []b2 = new byte[8096];
            DatagramPacket dp2 = new DatagramPacket(b2,b2.length);
            ds.receive(dp2);
            String received = new String(dp2.getData());
            if(received.equals("end")) {
                break;
            }
            System.out.println("server : "+received);
        }
    }
}