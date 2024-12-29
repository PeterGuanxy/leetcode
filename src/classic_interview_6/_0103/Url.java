package classic_interview_6._0103;

/**
 * ** Created by Peter on 2022年09月15日, 0015.
 *
 * @author Peter
 */
public class Url {

  public String replaceSpaces(String S, int length) {

    char[] charsS = S.toCharArray();
    char[] res = new char[charsS.length * 3];
    int index = 0;
    for (int i = 0; i < length; i++) {
      if (charsS[i] == ' ') {
        res[index++] = '%';
        res[index++] = '2';
        res[index++] = '0';
      } else {
        res[index++] = charsS[i];
      }
    }

    return String.valueOf(res, 0, index);

  }


}
