class mythread implements Runnable{
    int counter;
    String name;
    mythread(String name, int c) {
        this.name = name;
        this.counter = c;
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
public class threadrunnable {
    public static void main(String[] args) throws Exception {
        mythread object = new mythread("odd", 1);
        Thread t = new Thread(object);
        t.start();
        mythread object2 = new mythread("even", 2);
        Thread t2 = new Thread(object2);
        t2.start();
        System.out.println(t.isAlive());
        System.out.println(t2.isAlive());
        t.join();
        System.out.println("thread odd is alive " + t.isAlive());
        t2.join();
        System.out.println("thread even is alive " + t2.isAlive());
        System.out.println("end of main");
    }
}