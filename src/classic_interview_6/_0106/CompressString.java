package classic_interview_6._0106;

/**
 * ** Created by Peter on 2022年09月16日, 0016.
 *
 * @author Peter
 */
public class CompressString {

  public String compressString(String S) {
    if (S.length() <= 1) {
      return S;
    }
    StringBuilder builder = new StringBuilder();

    char curr = S.charAt(0);
    int count = 0;
    for (char c : S.toCharArray()) {
      if (c == curr) {
        count++;
        continue;
      }
      builder.append(curr).append(count);
      curr = c;
      count = 1;
    }
    builder.append(curr).append(count);

    return builder.toString().length() >= S.length() ? S : builder.toString();
  }

}
