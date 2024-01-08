package Java8Features;
interface Demo
{
    int add(int a,int b);
    default void print()
    {
        System.out.println("Say hello");
    }
}
public class DefaultMethodInterface implements Demo{
    static final double pi=22.7;

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Demo ref=new DefaultMethodInterface();
        System.out.println(ref.add(5,2));
        ref.print();
        //By using the interface demo we can only use the methods in the interface
        // we cannot access the variable in the Interface

        DefaultMethodInterface obj=new DefaultMethodInterface();
        System.out.println(obj.sub(5,3));

        //by using the object of the class only be we can be able to use the methods in the class
        System.out.println(pi);
        System.out.println(obj.toString());
    }
}
