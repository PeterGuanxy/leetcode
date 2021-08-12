package algorithms._1138_alphabet_board_path;

/**
 * ** Created by peter.guan on 2021/08/12.
 *
 * @author peter.guan
 */
public class AlphabetBoardPath {

    public String alphabetBoardPath(String target) {
        int[] curr = new int[]{0, 0};
        char index = 'a';
        StringBuilder res = new StringBuilder();
        for (char a : target.toCharArray()) {
            int n = a - 97;
            int[] des = new int[]{n / 5, n % 5};
            String x = des[1] > curr[1] ? "R" : "L";
            String y = des[0] > curr[0] ? "D" : "U";
            if (index != 'z') {
                for (int i = 0; i < Math.abs(des[1] - curr[1]); i++) {
                    res.append(x);
                }
                for (int i = 0; i < Math.abs(des[0] - curr[0]); i++) {
                    res.append(y);
                }
                res.append("!");
                curr = des;
                index = a;
                continue;
            }
            for (int i = 0; i < Math.abs(des[0] - curr[0]); i++) {
                res.append(y);
            }
            for (int i = 0; i < Math.abs(des[1] - curr[1]); i++) {
                res.append(x);
            }
            res.append("!");
            curr = des;
            index = a;
        }
        return res.toString();

    }

    public static void main(String[] args) {
        System.out.println('a' + 0);
    }

}
