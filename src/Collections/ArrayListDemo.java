package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Character> al=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            al.add((char) (65+i));
        }
        for (Character character : al)
        {
            System.out.println((char)(character+1));
        }
    }
}
