import java.util.Scanner;

public class stringbuffermethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userInput = sc.next();
        StringBuffer s = new StringBuffer(userInput);
        // using charAt()
        System.out.println("Character at 3 :" + s.charAt(3));
        // using length()
        System.out.println("length of s :" + s.length());
        // using append() function
        System.out.println("enter a string to append to the previous string:");
        String userInp = sc.next();
        StringBuffer s2 = new StringBuffer(userInp);
        s.append(s2);
        System.out.println("string after appending the input string:" + s);
        // using the substring() function
        System.out.println("Substring of s starting from 2nd index:" + s.substring(2));
        // using delete() function of string buffer
        System.out.println("Enter the start index & end index from which you want the character to be deleted:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        s.delete(start, end);
        System.out.println("After deleting that character we have:" + s);
        // using deleteCharAt()
        System.out.println("enter the index from where character must be deleted:");
        int idx = sc.nextInt();
        s.deleteCharAt(idx);
        System.out.println("String after deleting the character:" + s);
        // using capacity() in stingbuffer
        System.out.println("capacity of this buffer:" + s.capacity());
        // using ensureCapacity() to set the minimum desired capacity
        s.ensureCapacity(30);
        System.out.println("after updating the capacity:" + s.capacity());
        // using indexOf()
        System.out.println("enter the character to get index where it is present ");
        String c = sc.next();
        System.out.println("character " + c + " is at index is " + s.indexOf(c));
        // using insert(destination,character)
        System.out.println("enter the charter to be inserted");
        String instchar = sc.next();
        System.out.println("enter the postion where it has to be inserted");
        int pos = sc.nextInt();
        s.insert(pos, instchar);
        System.out.println("After insrting we have " + s);
        // using setCharAt()
        System.out.println("enter the charter to be to be changed with");
        char changechar = sc.next().charAt(0);
        System.out.println("enter the postion where it has to be changed");
        int posn = sc.nextInt();
        s.setCharAt(posn, changechar);
        System.out.println("After changing we have " + s);
        // using getChars(srcidxstart,srcidxend,destination,dststart)
        System.out.println("enter start of source to getChar");
        int getStart = sc.nextInt();
        System.out.println("enter end of source to getChar");
        int getEnd = sc.nextInt();
        System.out.println("enter start of destination to insert");
        int destStart = sc.nextInt();
        int size = getEnd - getStart + 1;
        char[] getter = new char[size];
        s.getChars(getStart, getEnd, getter, destStart);
        System.out.print("retreived character :");
        for (int i = 0; i < size; i++) {
            System.out.print(getter[i]);
        }
        System.out.println();
        // using setLength()'
        System.out.println("old length is :" + s.length() + " enter the new length ");
        int l = sc.nextInt();
        s.setLength(l);
        System.out.println("new length : " + s.length());
        // using toString
        System.out.print("String representation of object s :" + s.toString());
        sc.close();
    }
}
