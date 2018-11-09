package algorithms._06_zigzag_convertion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ** Created by peter.guan on 2018/11/8.
 *
 * @author peter.guan
 */
public class ZigZagConvertion {

  public String zigzag(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }
    Map<Integer, String> map = new HashMap<>(numRows);
    for (int i = 1; i <= numRows; i++) {
      map.put(i, "");
    }

    int line = 1;
    int abs = 1;
    for (int i = 0; i < s.length(); i++) {
      String str = map.get(line);
      str += s.charAt(i);
      map.put(line, str);

      line += abs;
      if (line == 1) {
        abs = 1;
      }
      if (line == numRows) {
        abs = -1;
      }
    }
    StringBuilder str = new StringBuilder();
    for (int i = 1; i <= numRows; i++) {
      str.append(map.get(i));
    }
    return str.toString();
  }

  public static void main(String[] args) {
    ZigZagConvertion function = new ZigZagConvertion();
    System.out.println(function.zigzag("PAYPALISHIRING", 1));
  }

  public String convert(String s, int numRows) {

    if (numRows == 1) {
      return s;
    }

    List<StringBuilder> rows = new ArrayList<>();
    for (int i = 0; i < Math.min(numRows, s.length()); i++) {
      rows.add(new StringBuilder());
    }

    int curRow = 0;
    boolean goingDown = false;

    for (char c : s.toCharArray()) {
      rows.get(curRow).append(c);
      if (curRow == 0 || curRow == numRows - 1) {
        goingDown = !goingDown;
      }
      curRow += goingDown ? 1 : -1;
    }

    StringBuilder ret = new StringBuilder();
    for (StringBuilder row : rows) {
      ret.append(row);
    }
    return ret.toString();
  }

}
