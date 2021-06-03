package algorithms._0003_longest_substring_without_repeating_characters;

/**
 * ** Created by guanxy on 2018/7/7.
 *
 * @author guanxy
 */
public class LengthOfLongestSubstring {

  //超时
//  public static int lengthOfLongestSubstring(String s) {
//    int n = s.length();
//    int ans = 0;
//    for (int i = 0; i < n; i++)
//      for (int j = i + 1; j <= n; j++)
//        if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
//    return ans;
//  }
//
//  public static boolean allUnique(String s, int start, int end) {
//    Set<Character> set = new HashSet<>();
//    for (int i = start; i < end; i++) {
//      Character ch = s.charAt(i);
//      if (set.contains(ch)) return false;
//      set.add(ch);
//    }
//    return true;
//  }

  public static int lengthOfLongestSubstring(String s) {
    int n = s.length(), ans = 0;
    int[] index = new int[128]; // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < n; j++) {
      i = Math.max(index[s.charAt(j)], i);
      ans = Math.max(ans, j - i + 1);
      index[s.charAt(j)] = j + 1;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("rzzohjzqefpmhugxxhtvmwzxuzcfzsertghbpittnjiudorbxmwkjvjfxnmwfrpzxwametiresniiglgtjsegd"));
  }
}
