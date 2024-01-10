package LeetCode;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        String cur=String.valueOf(s.charAt(0));
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(cur.contains(String.valueOf(s.charAt(j))))
                    break;
                cur+=s.charAt(j);
            }
            if(cur.length()>ans.length()) {
                ans = cur;
                System.out.println(ans);
            }
        }
        return ans.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
