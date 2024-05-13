class mythread1 implements Runnable {
    Thread t;
    String threadName;
    int mul;

    mythread1(String name, int c) {
        threadName = name;
        mul = c;
        t = new Thread(this, threadName);
        System.out.println("child " + t);
    }

    public void run() {
        try {
            Thread t1 = Thread.currentThread();
            t1.setPriority(3);
            System.out.println("Thread " + Thread.currentThread().getName() + " of Id "
                    + Thread.currentThread().getId() + " of priority " + t1.getPriority() +
                    " is running");
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + mul + " X " + i + " = " +
                        (mul * i));
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("Exception is caught" + e);
        }
    }
}

public class threadrunnable2 {
    public static void main(String[] args) throws Exception {
        mythread1 object = new mythread1("multiple of 3 ", 3);
        object.t.start();
        mythread1 object2 = new mythread1("multiple of 5 ", 5);
        object2.t.start();
        System.out.println(object.t.isAlive());
        System.out.println(object2.t.isAlive());
        object.t.join();
        System.out.println("thread multiple of 3 is alive " + object.t.isAlive());
        object2.t.join();
        System.out.println("thread multiple of 5 is alive " + object2.t.isAlive());
        System.out.println("end of main");
    }
}