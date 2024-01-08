package Threads;
class Operation
{
    int  count;
    public  void increment()
    {
        count ++;
    }
    public void decrement()
    {
        count--;
    }
}
public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Operation operation=new Operation();
        Thread t1=new Thread(
                ()->{
                    for(int i=0;i<1000;i++)
                    {
                        if(i>500)
                            operation.decrement();
                        if(i%100==0)
                            operation.decrement();
                        operation.increment();
                    }
                }
        );
        Thread t2=new Thread(
                ()->{
                    for(int i=0;i<200;i++)
                    {
                        operation.increment();
                    }
                }
        );
        t1.start();
        Thread.sleep(1);
        t2.start();
        Thread.sleep(2);
        System.out.println("count="+operation.count);
    }
}
