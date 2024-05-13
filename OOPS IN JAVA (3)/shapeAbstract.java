import java.util.*;

abstract class figure {
    abstract void area(int a);

    abstract void volume(int a);

    public void display() {
        System.out.println("Parent class");
    }
}

class Cube extends figure {
    public void area(int a) {
        System.out.println("Area of Cube: " + 6 * a * a);
    }

    public void volume(int a) {
        System.out.println("Volume of Cube: " + a * a * a);
    }
}

class Sphere extends figure {
    public void area(int a) {
        System.out.println("Area of Sphere: " + 4 * 3.14 * a * a);
    }

    public void volume(int a) {
        System.out.println("Volume of Sphere: " + (4 / 3) * 3.14 * a * a * a);
    }
}

class shapeAbstract {
    public static void main(String[] args) {
        Cube c = new Cube();
        Sphere s = new Sphere();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter edge of cube: ");
        int edge = sc.nextInt();
        System.out.print("Enter radius of sphere: ");
        int sphere = sc.nextInt();
        c.area(edge);
        c.volume(edge);
        c.display();
        s.area(sphere);
        s.volume(sphere);
        s.display();
        sc.close();
    }
}