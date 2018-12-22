package algorithms._08_string_to_integer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ** Created by peter.guan on 2018/12/22.
 *
 * @author peter.guan
 */
public class StringToInteger {

  public int myAtoi(String str) {

    str = str.trim();
    if (str.length() == 0) {
      return 0;
    }

    if (str.startsWith("-")) {
      str = str.replaceFirst("-", "");
      if (str.length() == 0) {
        return 0;
      }
      Pattern pattern = Pattern.compile("[^0-9]+");
      Matcher matcher = pattern.matcher(str);

      str = matcher.replaceAll(",");
      if (str.startsWith(",")) {
        return 0;
      }

      String[] split = str.split(",");
      double i = 0 - Double.parseDouble(split[0]);
      if (i <= Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      return (int) i;
    }

    if (str.startsWith("+")) {
      str = str.replaceFirst("\\+", "");
    }

    Pattern pattern = Pattern.compile("[^0-9]+");
    Matcher matcher = pattern.matcher(str);

    str = matcher.replaceAll(",");
    if (str.startsWith(",")) {
      return 0;
    }

    String[] split = str.split(",");
    double i = Double.parseDouble(split[0]);
    if (i >= Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    return (int) i;

  }

  public static void main(String[] args) {

    StringToInteger a = new StringToInteger();
    System.out.println(a.myAtoi("  0000000000012345678"));
  }

}
