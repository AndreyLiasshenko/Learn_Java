package Book.MultithreadedProgramming;


public class NewThread2 extends Thread {

    NewThread2() {
        // создать новый поток исполнения
        super("Child thread");
        System.out.println("Child thread was created " + this);
        start();
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

class ExtendThread {
    public static void main(String[] args) {
        new NewThread2(); //create new thread

        try {
            for (int i = 5; i> 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was stopped");
        }
        System.out.println("Main thread was finished");
    }
}

