package TCP;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.net.Socket;
public class serverTCP {
   public static void main(String args[]) throws IOException {
      
       ServerSocket ss = new ServerSocket(5571);
       Socket s = ss.accept();
           while(true) {
               //code for reading  at the server side
               InputStreamReader ir = new InputStreamReader(s.getInputStream());
               BufferedReader br = new BufferedReader(ir);
               String str = br.readLine();
               System.out.println(str);

               //code for wrting at the server side
               Scanner sc = new Scanner(System.in);
               String to_write = sc.nextLine();
               if(to_write.equals("EXIT")) break;
               OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
               PrintWriter pw = new PrintWriter(osw);
               pw.println(to_write);
               osw.flush();
       }
       s.close();
      
   }
}
