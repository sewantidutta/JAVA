package TCP;

import java.net.ServerSocket;
import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.io.IOException;
public class clientDISTCP {
   public static void main(String args[]) throws IOException{
       Socket s = new Socket("localhost",7764);
      
       while(true) {
      
           //writing code client side
           Scanner sc = new Scanner(System.in);
           DataOutputStream dos = new DataOutputStream(s.getOutputStream());
           System.out.print("Client : ");
           String str1 = sc.nextLine();
           if(str1.equals("EXIT")) break;
           dos.writeUTF(str1);

           //reading code client side
           DataInputStream dis = new DataInputStream(s.getInputStream());
           String str = (String)dis.readUTF();
           System.out.println("Server : "+str);

       }

       s.close();
   }
}
