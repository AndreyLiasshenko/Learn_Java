package Book.MultithreadedProgramming;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // создать новый поток исполнения
        t = new Thread(this, "Demonstration thread");
        System.out.println("Child thread was created " + t);
        t.start();
    }


    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread was stopped");
        }
        System.out.println("Child thread was finished");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); //create new thread

        try {
            for (int i = 5; i> 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was stopped");
        }
        System.out.println("Main thread was finished");
    }
}

