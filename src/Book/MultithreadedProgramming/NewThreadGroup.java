package Book.MultithreadedProgramming;

public class NewThreadGroup extends Thread {
    boolean stateFlag;

    NewThreadGroup(ThreadGroup tg, String threadname) {
        super(tg, threadname);
        stateFlag = false;
        System.out.println("Thread is created: " + tg.getName());
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized(this) {
                    while(stateFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception " + getName());
        }
        System.out.println(getName() + " stop");
    }

    synchronized void resumeThread() {
        stateFlag = false;
        notify();
    }

    synchronized void suspendThread() {
        stateFlag = true;
    }
}

class TestGroup {
    public static void main(String[] args) {

        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThreadGroup ob1 = new NewThreadGroup(groupA,"one");
        NewThreadGroup ob2 = new NewThreadGroup(groupA, "two");
        NewThreadGroup ob3 = new NewThreadGroup(groupB, "three");
        NewThreadGroup ob4 = new NewThreadGroup(groupB, "four");

        System.out.println("output with method list");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Group A is stopping");
        Thread[] threadArr = new Thread[groupA.activeCount()];
        groupA.enumerate(threadArr);
        for (int i =0; i<threadArr.length; i++) {
            ((NewThreadGroup)threadArr[i]).suspendThread();
        }

        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("resume group A");

        for (int i =0; i<threadArr.length; i++) {
            ((NewThreadGroup)threadArr[i]).resumeThread();
        }

        try {
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();

        }catch (Exception e) {
            System.out.println("Exception in main thread");
        }
        System.out.println("Main thread is stop");
    }

}
