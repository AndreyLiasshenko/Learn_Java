package Book.MultithreadedProgramming;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name+" into A.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Stopped");
        }
        System.out.println(name + "try to call method B.last()");

        b.last();
    }

    synchronized void last() {
        System.out.println("B in method A.last()");
    }
}


class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "into method B.bar()");
        try {
            Thread.sleep(1000);
        } catch (Exception e ) {
            System.out.println("Stopped");
        }

        System.out.println(name + "try to call method A.last()");

        a.last();
    }

    synchronized void last() {
        System.out.println("B in method A.last()");
    }
}

class DeadLock implements Runnable{
    A a = new A();
    B b = new B();

    DeadLock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Discordant thread");
        t.start();

        a.foo(b);
        System.out.println("Back in main thread");
    }

    public void run (){
        b.bar(a);
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}

