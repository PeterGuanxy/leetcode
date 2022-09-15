package classic_interview_6._0102;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ** Created by Peter on 2022年09月14日, 0014.
 *
 * @author Peter
 */
public class RandomSortIsEquals {

  public boolean CheckPermutation(String s1, String s2) {

    if (s1.length() != s2.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) {
      int count = map.getOrDefault(c, 0);
      count++;
      map.put(c, count);
    }
    for (char c : s2.toCharArray()) {
      int count = map.getOrDefault(c, 0);
      count--;
      if (count < 0) {
        return false;
      }
      map.put(c, count);
    }

    return true;
  }

  public boolean check2(String s1, String s2) {

    if (s1.length() != s2.length()) {
      return false;
    }

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

    return String.valueOf(c1).equals(String.valueOf(c2));
  }

}
