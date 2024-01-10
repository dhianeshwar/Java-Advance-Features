package LeetCode;

import java.util.Arrays;

public class LongestNumber {
    static int temp=0;
    static int ans=1;
    public static int[] large(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
        }
        for(int num:nums)
        {
            ans=ans*num;
        }
        System.out.println(ans);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={9,3,8,5,10};
        int[] arr=large(nums);
        System.out.println(Arrays.toString(arr));
    }
}
