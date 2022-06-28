package Book.MultithreadedProgramming;

public class NewControlThread implements Runnable {
    Thread t;
    boolean threadFlag;
    String name;

    NewControlThread(String nameThread) {
        name = nameThread;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        threadFlag = false;
        t.start();
    }

    public void run() {
        try {
            for (int i = 15; i>0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (threadFlag) {
                        wait();
                    }
                }
            }
            } catch (InterruptedException e) {
            System.out.println(name +  " Stopped");

        }
        System.out.println(name + " finished");
    }

    synchronized void mysuspend() {
        threadFlag = true;
    }

    synchronized void myresume() {
        threadFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewControlThread ob1 = new NewControlThread("first");
        NewControlThread ob2 = new NewControlThread("second");

        try {
            if (ob1.t.getState() == Thread.State.RUNNABLE) System.out.println("Yes its run");
            Thread.sleep(3000);
            ob1.mysuspend();
            System.out.println(ob1.t.getState());
            System.out.println("Pause thread first");
            Thread.sleep(3000);
            ob1.myresume();
            System.out.println("Restoration thread first");
            ob2.mysuspend();
            System.out.println("Pause thread second");
            Thread.sleep(3000);
            ob2.myresume();
            System.out.println("Restoration thread second");

        } catch (InterruptedException e) {
            System.out.println("Main thread was stopped");
        }

        try {
            System.out.println("Waiting finished thread");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e ) {
            System.out.println("Main thread was stopped");
        }

        System.out.println("Main thread was finished");
    }
}