package Book.MultithreadedProgramming;

public class MethodsAliveAndJoin implements Runnable {
    String name;
    Thread t;

    MethodsAliveAndJoin(String nameThreads) {
        name = nameThreads;
        t = new Thread(this, name);
        System.out.println("Created new thread: "+ t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Thread" + name + " : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was stopped");
        }
        System.out.println("Thread" +name + " finished");
    }
}

class MethodsAliveJoinDemo {
    public static void main(String[] args) {
        MethodsAliveAndJoin ob1 = new MethodsAliveAndJoin("first");
        MethodsAliveAndJoin ob2 = new MethodsAliveAndJoin("second");
        MethodsAliveAndJoin ob3 = new MethodsAliveAndJoin("third");

        System.out.println("Thread first is run " + ob1.t.isAlive());
        System.out.println("Thread second is run " +ob2.t.isAlive());
        System.out.println("Thread third is run "+ ob3.t.isAlive());

        try {
            for (int i = 5; i>0; i--) {
                System.out.println("Main: " + i);
                ob1.t.join();
                ob2.t.join();
                ob3.t.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is stopped");
        }
        System.out.println("Thread first is run " + ob1.t.isAlive());
        System.out.println("Thread second is run " +ob2.t.isAlive());
        System.out.println("Thread third is run "+ ob3.t.isAlive());

        System.out.println("Main thread is finished");
    }
}
