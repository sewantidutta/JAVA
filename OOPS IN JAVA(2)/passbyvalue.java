class stud {
    int roll;

    stud(int roll) {
        this.roll = roll;
    }

    public static void swapRef(stud s1, stud s2) {
        stud temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println("After swapping in function value of s1 = " + s1.roll);
        System.out.println("After swapping in function value of s2 = " + s2.roll);
    }

    public static void swapVal(stud s1, stud s2) {
        int temp = s1.roll;
        s1.roll = s2.roll;
        s2.roll = temp;
        System.out.println("After swapping in function value of s1 = " + s1.roll);
        System.out.println("After swapping in function value of s2 = " + s2.roll);
    }

}

public class passbyvalue {
    public static void main(String[] args) {
        // creating stud object and assigning roll number via constructor
        stud s1 = new stud(100);
        stud s2 = new stud(200);

        // trying to swap by referece and checking the result
        System.out.println("TRYING TO SWAP BY REFERENCE");
        System.out.println("s1 roll before = " + s1.roll);
        System.out.println("s2 roll before = " + s2.roll + "\n");
        stud.swapRef(s1, s2);
        System.out.println("s1 roll after swaping is done = " + s1.roll);
        System.out.println("s2 roll after swapping is done = " + s2.roll);

        // trying to swap by passing the value
        System.out.println();
        System.out.println("TRYING TO SWAP BY PASSING THE VALUE");
        System.out.println("s1 roll before = " + s1.roll);
        System.out.println("s2 roll before = " + s2.roll + "\n");
        stud.swapVal(s1, s2);
        System.out.println("s1 roll after swapping is done = " + s1.roll);
        System.out.println("s2 roll after swapping is done = " + s2.roll);
    }
}
