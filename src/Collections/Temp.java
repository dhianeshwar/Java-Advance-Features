package Collections;

public class Temp {
    public static void main(String[] args) {
        FunctionInter add=(a,b)->a+b;
        FunctionInter sub=(a,b)->a-b;
        FunctionInter pro=(a,b)->a*b;

        Temp diff=new Temp();
        System.out.println(diff.operation(5,2,add));
        System.out.println(diff.operation(5,6,sub));
        System.out.println(diff.operation(9,2,pro));
        System.out.println(diff.lengthOfLastWord("    a        "));
        System.out.println(Integer.MAX_VALUE);
    }
    private int operation(int a,int b,FunctionInter fi)
    {
        return fi.operate(a,b);
    }
    public int lengthOfLastWord(String s) {
        int ans=1;
        s=s.trim();
        System.out.println(s);
        for(int i=s.length()-1;i>0;i--)
        {
            if(s.charAt(i)!=' '){
                System.out.println("hhhhhh");
                ans++;

            }
            if(s.charAt(i)==' ')
                break;
        }
        return ans;
    }
}
 interface FunctionInter
{
    int operate(int a,int b);
}
