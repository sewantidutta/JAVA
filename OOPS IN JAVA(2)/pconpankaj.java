class database {
    int size = 10;
    int[] db = new int[size];
    int in = 0;
    int out = 0;
    int count = 0;
    synchronized void set(int i) {
        try {
            while(count == size) {
                wait();
            }
            db[in] = i;
            in = (in + 1) % size;
            count++;
            notify();
        } catch(Exception e) {
            System.out.println("error");
        }
    }
    synchronized int get() {
        try {
            while(count == 0) {
                wait();
            }
            int item = db[out];
            out = (out + 1) % size;
            notify();
            
        }catch(Exception e) {
            System.out.println("error");
        }
        return out;
    }
}
class producer extends Thread{
    database db;
    int i = 1;
    producer(database d) {
        super("producer");
        db = d;
    }
    public void run() {
        while(true) {
            db.set(i);
            i++;
        }
    }
}
class consumer extends Thread{
    database db;
    consumer(database d) {
        super("consumer");
        db = d;
    }
    public void run() {
        while(true) {
            System.out.println("consumed "+db.get());
        }   
    }
}
public class pconpankaj {
        public static void main(String [] args) {
        database db = new database();
        producer p = new producer(db);
        consumer c = new consumer(db);
        p.start();
        c.start();
    }
}
