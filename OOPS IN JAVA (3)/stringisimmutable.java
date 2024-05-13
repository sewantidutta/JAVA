public class stringisimmutable{
    public static void main(String[] args) {
        // Creating two string objects with the same content
        String word1 = new String("Ritabrata");
        // Printing the original contents of the strings
        System.out.println("Content of String1 = " + word1);
        // Reassigning the variable word1 with a new string
        word1.concat("Dey");
        // Now, word1 points to a new string ("Dey"), while word2 still points to the
        // original string ("Ritabrata")
        System.out.println("Content of after changing String1 = " + word1);
    }
}