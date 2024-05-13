interface Apple {
    void dispAppleCam();

    void dispAppleOs();
}

interface Android {
    void dispAndOs();

    void dispAndCam();
}

abstract class Phone {
    abstract void displayScreenSize();

    void displayMaterial() {
        System.out.println("metallic body with glass back and molded display");
    }
}

class Device extends Phone implements Android, Apple {
    public void dispAppleCam() {
        System.out.println("12 megapixels");
    }

    public void dispAppleOs() {
        System.out.println("iOS 16.6");
    }

    public void dispAndOs() {
        System.out.println("Android 13");
    }

    public void dispAndCam() {
        System.out.println("500 megapixels");
    }

    public void displayScreenSize() {
        System.out.println("7 inches");
    }
}

public class phoneInterface {
    public static void main(String[] args) {
        Device obj = new Device();
        System.out.println("Apple phone");
        obj.dispAppleOs();
        obj.dispAppleCam();
        obj.displayScreenSize();
        System.out.println(" ");
        System.out.println("Android phone");
        obj.dispAndOs();
        obj.dispAndCam();
        obj.displayScreenSize();
    }
}
/*Interface A = apple
Interface A1 = android
Abstract class C = phone
Class D = device */