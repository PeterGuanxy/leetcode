package classic_interview_6._0104;

import java.util.HashSet;
import java.util.Set;

/**
 * ** Created by Peter on 2022年09月15日, 0015.
 *
 * @author Peter
 */
public class CanPermutePalindrome {

  public boolean canPermutePalindrome(String s) {

    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {

      if (set.contains(c)) {
        set.remove(c);
      } else {
        set.add(c);
      }

    }

    return set.size() <= 1;

  }

}
