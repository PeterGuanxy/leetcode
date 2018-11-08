package algorithms._05_longest_palindromic_substring;

import sun.util.resources.cldr.wae.LocaleNames_wae;

/**
 * ** Created by peter.guan on 2018/11/8.
 *
 * @author peter.guan
 */
public class LongestPalindromicSubstring {

  public String longPalindromic(String longStr) {
    if (longStr == null || longStr.length() < 1) {
      return "";
    }
    int start = 0;
    int end = 0;
    for (int i = 0; i < longStr.length(); i++) {
      int len1 = expandStr(longStr, i, i);
      int len2 = expandStr(longStr, i, i + 1);
      int len = Math.max(len1, len2);
      if (len > end - start) {
        start = i - (len - 1) / 2;
        end = i + len / 2;
      }
    }
    return longStr.substring(start, end + 1);
  }

  private int expandStr(String str, int left, int right) {

    int L = left;
    int R = right;
    while (L >= 0 && R < str.length() && str.charAt(L) == str.charAt(R)) {
      L--;
      R++;
    }
    return R - L - 1;
  }

  public static void main(String[] args) {
    LongestPalindromicSubstring function = new LongestPalindromicSubstring();
    System.out.println(function.longPalindromic("abadedfefgbbgfefded"));
  }

}
