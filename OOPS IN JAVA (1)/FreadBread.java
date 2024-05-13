import java.io.*;

public class FreadBread{
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("temp.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        System.out.println();
        System.out.println();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader isr = new BufferedReader(r);
        System.out.print("enter a line to be written into the file:");
        String addLine = isr.readLine();
        FileWriter fw = new FileWriter("temp.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(addLine);
        bw.close();
        System.out.println("AFTER WRITING:");
        FileReader fr2 = new FileReader("temp.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        String l;
        while ((l = br2.readLine()) != null) {
            System.out.println(l);
        }
        br.close();
    }
}
