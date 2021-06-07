package algorithms._0017_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

/**
 * ** Created by peter.guan on 2021/06/07.
 *
 * @author peter.guan
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }

        combine("", digits, digits.length(), 0, result);

        return result;
    }

    public void combine(String letter, String digits, int digitsLength, int n, List<String> res) {
        if (n == digitsLength) {
            res.add(letter);
            return;
        }

        String[] letters = getNumberLetters(String.valueOf(digits.charAt(n)));
        for (String a : letters) {
            combine(letter + a, digits, digitsLength, n + 1, res);
        }

    }

    public String[] getNumberLetters(String number) {
        switch (number) {
            case "2":
                return new String[]{"a", "b", "c"};
            case "3":
                return new String[]{"d", "e", "f"};
            case "4":
                return new String[]{"g", "h", "i"};
            case "5":
                return new String[]{"j", "k", "l"};
            case "6":
                return new String[]{"m", "n", "o"};
            case "7":
                return new String[]{"p", "q", "r", "s"};
            case "8":
                return new String[]{"t", "u", "v"};
            case "9":
                return new String[]{"w", "x", "y", "z"};
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber letter = new LetterCombinationsOfAPhoneNumber();
        System.out.println(letter.letterCombinations("23"));
    }
}
