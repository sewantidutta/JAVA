package TCP;

import java.net.ServerSocket;
import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.io.IOException;
public class serverDISTCP {
   public static void main(String args[]) throws IOException{
       ServerSocket ss = new ServerSocket(7764);
       Socket s = ss.accept();
       while(true) {
           //reading code server side
           DataInputStream dis = new DataInputStream(s.getInputStream());
           String str = (String)dis.readUTF();
           System.out.println("Client : "+str);

           //writing code server side
           DataOutputStream dos = new DataOutputStream(s.getOutputStream());
           Scanner sc = new Scanner(System.in);
           System.out.print("Server : ");
           String str1 = sc.nextLine();
           if(str1.equals("EXIT")) break;
           dos.writeUTF(str1);
       }
       s.close();
   }
}
