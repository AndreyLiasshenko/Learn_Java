package Book.MultithreadedProgramming;

public class ThreeThreads implements Runnable {
    String name;
    Thread t;

    ThreeThreads(String threadname) {
        name = threadname;
        System.out.println("");
        t = new Thread(this, name);
        System.out.println("New thread: " + name);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println(name +" : " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread "+ name + " was stopped");
        }
        System.out.println("Thread " + name + "was finished");
    }
}

class ThreeThreadsDemo{
    public static void main(String[] args) {
        new ThreeThreads("first");
        new ThreeThreads("second");
        new ThreeThreads("third");

        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was stopped");
        }
        System.out.println("Main thread was finished");
    }
}
