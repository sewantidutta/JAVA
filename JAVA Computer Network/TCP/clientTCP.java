package TCP; //remove this line if using files solo not as part of TCP folder
import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.net.Socket;
public class clientTCP {
   public static void main(String args[]) throws Exception {
  
       Socket s = new Socket("localhost",5571);
       while(true) {
          
           //writing at the client side
           Scanner sc = new Scanner(System.in);
           String to_write = sc.nextLine();
           if(to_write.equals("EXIT")) break;
           OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
           PrintWriter  pw = new PrintWriter(osw);
           pw.println(to_write);
           osw.flush();

           //reading at the server side
           InputStreamReader ir = new InputStreamReader(s.getInputStream());
           BufferedReader br = new BufferedReader(ir);
           String to_print = br.readLine();
           System.out.println(to_print);
       }
       s.close();
      


   }
}

