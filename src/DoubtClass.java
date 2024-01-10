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
    public static int majorityElement(int[] nums) {
        int count=0;
        int a=0;
        for(int i:nums){
            if(count==0){
                a=i;
            }
            if(a==i){
                count++;
            }
            else{
                count--;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Child childObject=new Child("message");
        System.out.println(childObject);
        karupu ref=(int a, int b) -> System.out.println(a+b);
        ref.add(5,4);
        int[] arr={3,4,9,0,0,1,8,9,9,9,9,2,3,3,4,8,15,2};
        System.out.println(DoubtClass.majorityElement(arr));
    }
}
