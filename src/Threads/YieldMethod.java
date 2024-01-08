package Threads;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            if(Thread.currentThread().getName().equals("thread1")) {
                try {
                    Thread.currentThread().join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
