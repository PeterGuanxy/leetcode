package classic_interview_6._0101;

import java.util.Arrays;

/**
 * ** Created by Peter on 2022年09月14日, 0014.
 *
 * @author Peter
 */
public class StringIsUnique {

  public boolean isUnique(String astr) {

    if (astr.length() > 26) {
      return false;
    }

    char[] chars = astr.toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i+1]) {
        return false;
      }
    }

    return true;
  }

}
