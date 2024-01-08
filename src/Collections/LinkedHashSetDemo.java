package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> lhs=new LinkedHashSet<>();
        for(int i=0;i<10;i++)
        {
            lhs.add(i);
            lhs.add(null);
            lhs.add(100);
        }
        Iterator<Integer> itr=lhs.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("It wont allow duplicates,Null will only be added one time.");
        lhs.removeIf(Objects::isNull);
        System.out.println(lhs.removeIf(integer -> integer%2==1));
     for(Integer i:lhs)
     {
        System.out.println(i);
     }
    }
}
