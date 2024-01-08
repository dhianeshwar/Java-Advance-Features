package Threads;

class AThread extends Thread
        {
            public void run()
            {
                for(int i=0;i<5;i++)
                {
                    System.out.println("1");
                    try{Thread.sleep(1500);} catch (Exception ignored){}
                }
            }
        }
        class ThreadInterface implements Runnable
        {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Interface");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
public class ThreadDemo {
    public static void main(String[] args) throws Exception
    {
        AThread aThread=new AThread();
        Thread t1=new Thread(()->
        {
             {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Interface");
                    try { Thread.sleep(500);} catch (InterruptedException e){}
                }
            }
        }) ;
//        System.out.println(t1.toString());
        aThread.start();
        t1.start();
        System.out.println("main");
        t1.join();

        aThread.join();
        System.out.println("good bye");
    }
}
