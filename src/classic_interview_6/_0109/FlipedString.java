package classic_interview_6._0109;

/**
 * ** Created by Peter on 2023年04月24日, 0024.
 *
 * @author Peter
 */
public class FlipedString {

  public boolean isFlipedString(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }

    s1 = s1 + s1;
    return s1.contains(s2);

  }

}
