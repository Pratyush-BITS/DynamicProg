package Extra;

public class LongestSubstringWithoutRepetition {

    private int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        for (int j = 0, i = 0; j < n; j++) {
            char temp = s.charAt(j);
            i = Math.max(index[temp], i);
            ans = Math.max(ans, j - i + 1);
            index[temp] = j+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepetition obj = new LongestSubstringWithoutRepetition();
        System.out.println(obj.lengthOfLongestSubstring("aalohamora"));
    }
}