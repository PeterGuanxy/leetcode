package algorithms._0038_count_and_say;

/**
 * ** Created by Peter on 2022年09月09日, 0009.
 *
 * @author Peter
 */
public class CountAndSay {

  public String countAndSay(int n) {

    String res = "1";
    if (n == 1) {
      return res;
    }

    for (int i = 0; i < n - 1; i++) {
      res = sayPre(res);
    }

    return res;
  }

  public String sayPre(String preStr) {
    int curr = 0;
    int count = 0;
    StringBuilder res = new StringBuilder();

    for (char c : preStr.toCharArray()) {
      if (curr == 0) {
        curr = Integer.parseInt(String.valueOf(c));
        count++;
        continue;
      }

      if (curr == Integer.parseInt(String.valueOf(c))) {
        count++;
      } else {
        res.append(count);
        res.append(curr);
        curr = Integer.parseInt(String.valueOf(c));
        count = 1;
      }
    }

    res.append(count);
    res.append(curr);
    return res.toString();
  }
}
