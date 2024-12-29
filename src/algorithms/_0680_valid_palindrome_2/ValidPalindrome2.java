package algorithms._0680_valid_palindrome_2;

/**
 * ** Created by guanxy on 2022/6/23.
 *
 * @author guanxy
 */
public class ValidPalindrome2 {

  public boolean validPalindrome(String s) {

    if (s.length() == 1) {
      return true;
    }
    return check(0, s.length() - 1, s, false);
  }

  public boolean check(int i, int j, String s, boolean removed) {
    while (i <= j) {

      if (s.charAt(i) == s.charAt(j)) {
        i++;
        j--;
        continue;
      }
      if (removed) {
        return false;
      }
      return check(i + 1, j, s, true) || check(i, j - 1, s, true);

    }
    return true;
  }

}
