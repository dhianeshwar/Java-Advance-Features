package Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> sl=new Stack<>();
        for(int i=0; i<6;i++)
        {
            System.out.println( sl.push(i));
        }
        System.out.println(sl.pop());
        System.out.println(sl.peek());
        Iterator<Integer> itr=sl.iterator();
        while(itr.hasNext())
        {
            if(itr.next()<4)
                itr.remove();
        }
        System.out.println(sl);
    }
}
