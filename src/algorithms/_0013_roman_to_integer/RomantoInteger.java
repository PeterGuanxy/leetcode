package algorithms._0013_roman_to_integer;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class RomantoInteger {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public int romanToInt(String s) {
        int value = 0;

        if (s == null || s == "") {
            return value;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (getVal(s.charAt(i)) >= getVal(s.charAt(i + 1))) {
                value += getVal(s.charAt(i));
            } else {
                value -= getVal(s.charAt(i));
            }
        }
        value += getVal(s.charAt(s.length() - 1));
        return value;
    }

    public int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        RomantoInteger roman = new RomantoInteger();
        System.out.println(roman.romanToInt("MCMXCIV"));


    }
}
