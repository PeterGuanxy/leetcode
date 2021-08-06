package algorithms._0806_number_of_lines_to_write_string;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        char[] ss = s.toCharArray();
        int line = 1;
        int width = 0;
        for (char a : ss) {
            if (width + widths[a - 97] <= 100) {
                width += widths[a - 97];
            } else {
                line++;
                width = widths[a - 97];
            }
        }
        return new int[]{line, width};
    }

}
