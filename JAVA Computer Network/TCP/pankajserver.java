package TCP;

import java.util.*;
import java.net.*;
import java.io.*;
public class pankajserver {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(4866);
        Socket s =  ss.accept();
        while(true) {
            
            //receive 
            InputStreamReader ir = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(ir);
            String st = br.readLine();
            if(st.equals("end")) {
                break;
            }
            System.out.println("client : "+st);


            //send
            int num = Integer.parseInt(st);
            num *= num;
            String send = String.valueOf(num);
            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
            PrintWriter pw = new PrintWriter(osw);
            pw.println(send);
            if(send.equals("end")) {
                break;
            }
            osw.flush();

        }

    } 
}