package LeetCode;
//----------------------------Leet code problem:->1160(Find words that can be formed by given chars)----------
public class StringPresent {
    public int countCharacters(String[] words, String chars) {
        String org=chars;
        int count=0;
        int answer=0;
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (chars.contains(String.valueOf(word.charAt(j)))) {
                    count++;
                    chars = charRemoveAt(chars, chars.indexOf(String.valueOf(word.charAt(j))));
                }
                if (count == word.length()) {
                    answer = answer + word.length();
                    System.out.println(word);
                }
            }
            count = 0;
            chars = org;
        }
        return answer;
    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String[] args) {
        String[] arr ={"hello","world","leetcode"};
        String chars="welldonehoneyr";
        StringPresent obj=new StringPresent();
        System.out.println(obj.countCharacters(arr,chars));
    }
}

