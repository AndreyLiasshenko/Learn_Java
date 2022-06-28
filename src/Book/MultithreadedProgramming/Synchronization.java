package Book.MultithreadedProgramming;

class Synchronization {

    void call(String msg) {
        System.out.print("[ "+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
        System.out.println("]");
    }
}


class Caller implements Runnable{
    Synchronization target;
    String msg;
    Thread t;

    Caller (Synchronization targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}

class TestSync {
    public static void main(String[] args) {
        Synchronization target = new Synchronization();
        Caller ob1 = new Caller(target,"Welcome");
        Caller ob2 = new Caller(target, "in synchronized");
        Caller ob3 = new Caller(target, "world");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
    }
}