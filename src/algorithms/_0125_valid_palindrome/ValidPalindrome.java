package algorithms._0125_valid_palindrome;

import java.util.Locale;

/**
 * ** Created by guanxy on 2022/6/23.
 *
 * @author guanxy
 */
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    char[] array = s.toCharArray();
    int i = 0;
    int j = array.length - 1;

    while (i < j) {
      if (!Character.isLetterOrDigit(array[i])) {
        i++;
        continue;
      }
      if (!Character.isLetterOrDigit(array[j])) {
        j--;
        continue;
      }
      if (Character.toLowerCase(array[i]) != Character.toLowerCase(array[j])) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
