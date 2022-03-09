package algorithms._1805_number_of_different_integers_in_a_string;

import java.util.HashSet;
import java.util.Set;

/**
 * description
 *
 * @author Peter Guan
 * @date 2022/3/9
 */
public class NumberOfDifferentIntegersInAString {

  public int numDifferentIntegers(String word) {


    word = word.replaceAll("[a-z]", " ");
    Set<String> set = new HashSet<>();
    String[] strs = word.split(" ");
    for (String str : strs) {
      if (str.length() > 0) {
        set.add(str.replaceAll("^0*", ""));
      }
    }

    return set.size();
  }


}

