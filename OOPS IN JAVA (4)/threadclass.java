class mythread extends Thread {
    int counter;

    mythread(String name, int c) {
        super(name);
        counter = c;
        System.out.println("child" + this);
    }

    public void run() {
        try {
            Thread t = Thread.currentThread();
            t.setPriority(3);
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " of Id " + Thread.currentThread().getId()
                    + " of priority " + t.getPriority() +
                    " is running");
            for (int i = counter; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);
                i++;
                Thread.sleep(500);
            }
        } catch (Exception e) { // Throwing an exception
            System.out.println("Exception is caught" + e);
        }
    }
}

// Main Class
public class threadclass {
    public static void main(String[] args) throws Exception {
        mythread object = new mythread("odd", 1);
        object.start();
        mythread object2 = new mythread("even", 2);
        object2.start();
        System.out.println(object.isAlive());
        System.out.println(object2.isAlive());
        object.join();
        System.out.println("thread odd is alive " + object.isAlive());
        object2.join();
        System.out.println("thread even is alive " + object2.isAlive());
        System.out.println("end of main");
    }
}