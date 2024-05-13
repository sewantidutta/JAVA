class Table1 {
    synchronized void printTable(int n) {
        System.out.println("Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyT1 extends Thread {
    Table1 t;

    MyT1(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyT2 extends Thread {
    Table1 t;

    MyT2(Table1 t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class threadsynchro {
    public static void main(String args[]) {
        Table1 obj = new Table1();
        MyT1 t1 = new MyT1(obj);
        MyT2 t2 = new MyT2(obj);
        t1.start();
        t2.start();
    }
}
