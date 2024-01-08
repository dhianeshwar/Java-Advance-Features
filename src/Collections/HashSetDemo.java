package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Assuming you have an array of integers
        int[] nums = {1, 2, 3,4};
        boolean result = false;
        Set<Integer> s = new HashSet();
        for (int num : nums) {
            if (!s.add(num))
            {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}