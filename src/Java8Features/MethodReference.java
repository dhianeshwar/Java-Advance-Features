package Java8Features;
interface Parse
{
    int findElement(int[] nums,int num);
}
public class MethodReference {
    public static void main(String[] args) {
        Parse p = (int[] nums, int num) -> {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    num = i;
                    break;
                }
            }
            return num;
        };
        int[] arr = {1, 2, 3};
        int ans=p.findElement(arr,2);
        System.out.println(ans);
    }
}
