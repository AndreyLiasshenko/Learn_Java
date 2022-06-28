package Book.MultithreadedProgramming;

public class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while(!valueSet)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Exception is catch");
        }
        System.out.println("Get: "+n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception is catch");
            }
            this.n = n;
            valueSet = true;
            System.out.println("Sent: " +n);
            notify();
    }
}

class Produser implements Runnable{
    Q q;

    Produser(Q q) {
        this.q = q;
        new Thread(this, "Provider").start();
    }

    public void run() {
        int i = 0;

        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Produser(q);
        new Consumer(q);

        System.out.println("For stop press Ctrl-C");
    }
}