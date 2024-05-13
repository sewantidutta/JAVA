class Vehicle {
    void speedUp(int Inc) {
        System.out.println("vehicle is unknown");
    }
}

class Car extends Vehicle {
    int speed = 0;

    void speedUp(int Inc) {
        System.out.println("The initial speed of car is " + this.speed + "miles/h");
        System.out.println("After increasing the speed by " + Inc);
        this.speed += Inc;
        System.out.println("The car is now running @ speed " + this.speed + "miles/h");
    }
}

class Bicycle extends Vehicle {
    int speed = 0;

    void speedUp(int Inc) {
        System.out.println("The initial speed of bicycle is " + this.speed + "miles/h");
        System.out.println("After increasing the speed by " + Inc);
        this.speed += Inc;
        System.out.println("The bicycle is now running @ speed" + this.speed + " miles/h");
    }
}

public class speedup {
    public static void main(String[] args) {
        Car c = new Car();
        c.speedUp(10);
        Bicycle b = new Bicycle();
        b.speedUp(100);
    }
}