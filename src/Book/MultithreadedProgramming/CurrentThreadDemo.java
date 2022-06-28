package Book.MultithreadedProgramming;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current executing thread ---> " + t);
        //Set name thread
        t.setName("My thread");
        System.out.println("After rename thread ---> " + t);

        try {
            for (int i =0; i<5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was stopped");
        }

    }
}
