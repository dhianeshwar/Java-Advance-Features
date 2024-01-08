interface karupu
{
    void add(int a,int b);
}
class Parent
{
    public Parent()
    {
        System.out.println("In parent");
    }public Parent(String message)
    {
        System.out.println("In parent  " +message);
    }
}
class Child extends Parent
{
    public Child(String message)
    {
        System.out.println("In Child"+message);
    }
}

public class DoubtClass {
    public static void main(String[] args) {
        Child childObject=new Child("message");
        System.out.println(childObject.toString());
        karupu ref=new karupu() {
            @Override
            public void add(int a, int b) {
                System.out.println(a+b);
            }
        };
        ref.add(5,4);
    }
}
