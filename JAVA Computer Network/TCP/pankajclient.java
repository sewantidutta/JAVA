package TCP;

import java.util.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.*;
public class pankajclient {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",4866);
        while(true) {

            //send
            String send = sc.next();
            OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
            PrintWriter pw = new PrintWriter(osw);
            pw.println(send);
            if(send.equals("end")) {
                break;
            }
            osw.flush();

            //receive 
            InputStreamReader ir = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(ir);
            String st = br.readLine();
            if(st.equals("end")) {
                break;
            }
            System.out.println("server :"+st);


        }

    } 
}