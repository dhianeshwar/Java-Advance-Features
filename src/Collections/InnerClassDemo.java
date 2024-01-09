package Collections;
class OuterClass
{
    private int outerVar;
    public OuterClass(int var)
    {
        outerVar=var;
    }

    public void show()
    {
        System.out.println("The value of outer class variable is "+outerVar);
    }

    public class InnerClass
    {
        public void showValue()
        {
            System.out.println("The value of outer class variable is "+outerVar);
        }

        public InnerClass()
        {
            System.out.println("IN Inner class constructor");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass obj=new OuterClass(3);
        OuterClass.InnerClass innerClass= obj.new InnerClass();
        obj.show();
        innerClass.showValue();
//        obj.showValue();
    }
}