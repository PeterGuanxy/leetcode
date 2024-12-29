package classic_interview_6._0105;

/**
 * ** Created by Peter on 2022年09月15日, 0015.
 *
 * @author Peter
 */
public class OneEditAway {

  public boolean oneEditAway(String first, String second) {

    if (Math.abs(first.length() - second.length()) > 1) {
      return false;
    }

    boolean enable = true;
    if (first.length() == second.length()) {
      for (int i = 0; i < first.length(); i++) {
        if (first.charAt(i) != second.charAt(i)) {
          if (enable) {
            enable = false;
          } else {
            return false;
          }
        }
      }
    } else {

      String temp;
      if (first.length() < second.length()) {
        temp = first;
        first = second;
        second = temp;
      }

      int i = 0, j = 0;
      while (i < first.length() && j < second.length()) {
        if (first.charAt(i) != second.charAt(j)) {
          if (enable) {
            enable = false;
            i++;
            continue;
          } else {
            return false;
          }
        }
        i++;
        j++;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    OneEditAway oneEditAway = new OneEditAway();
    String first = "a";
    String second = "b";
    oneEditAway.oneEditAway(first, second);
  }
}
