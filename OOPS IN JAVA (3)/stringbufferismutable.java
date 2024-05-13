public class stringbufferismutable{
    public static void main(String[] args) {
        StringBuffer word1 = new StringBuffer("Ritabrata");
        System.out.println("Content of String1 = " + word1);
        word1.append("-Sankalpa");
        System.out.println("Content after changing String1 = " + word1);
    }
}