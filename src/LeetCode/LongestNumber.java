package LeetCode;

import java.util.*;

public class LongestNumber {
   public static int large(int[] nums)
    {

        int ans=0;
        List<Integer> li=new ArrayList<>();
        for(int num:nums)
        {
            if(num>9)
            {
                while(num>0)
                {
                    li.add(num%10);
                    num=num/10;
                }
                continue;
            }
            li.add(num);
        }
        li.sort(Collections.reverseOrder());
        for(int num:li)
        {
            ans=(ans * 10)+num;
        }

        System.out.println(li);
        return  ans;
    }
    public static void main(String[] args) {
        int[] nums={10,2};
        int arr=large(nums);
        System.out.println(arr);
    }
}
