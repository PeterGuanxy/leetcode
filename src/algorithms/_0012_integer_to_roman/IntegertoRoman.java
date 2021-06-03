package algorithms._0012_integer_to_roman;

import java.util.TreeMap;

/**
 * ** Created by peter.guan on 2021/06/03.
 *
 * @author peter.guan
 */
public class IntegertoRoman {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    /**
     * 方法一
     */
    public String intToRoman(int num) {

        String roman = "";
        int thousand = num / 1000;
        for (int i = 0; i < thousand; i++) {
            roman += "M";
        }
        num = num % 1000;
        roman = trans(roman, num, 100, "C", "D", "M");
        num = num % 100;
        roman = trans(roman, num, 10, "X", "L", "C");
        num = num % 10;
        roman = trans(roman, num, 1, "I", "V", "X");

        return roman;
    }

    public String trans(String roman, int num, int unit, String c, String midc, String upperc) {
        int count = num / unit;
        if (count == 0) {
            return roman;
        }
        if (count == 9) {
            roman = roman + c + upperc;
        }
        if (5 < count && count < 9) {
            roman += midc;
            for (int i = 0; i < count - 5; i++) {
                roman += c;
            }
        }
        if (count == 5) {
            roman += midc;
        }
        if (count == 4) {
            roman = roman + c + midc;
        }
        if (count < 4) {
            for (int i = 0; i < count; i++) {
                roman += c;
            }
        }
        return roman;
    }

    /**
     * 方法二
     * faster
     */
    public String intToRoman2(int num) {
        StringBuilder result = new StringBuilder();

        num = operate(num, 1000, "M", result);
        num = operate(num, 900, "CM", result);
        num = operate(num, 500, "D", result);
        num = operate(num, 400, "CD", result);
        num = operate(num, 100, "C", result);
        num = operate(num, 90, "XC", result);
        num = operate(num, 50, "L", result);
        num = operate(num, 40, "XL", result);
        num = operate(num, 10, "X", result);
        num = operate(num, 9, "IX", result);
        num = operate(num, 5, "V", result);
        num = operate(num, 4, "IV", result);
        num = operate(num, 1, "I", result);

        return result.toString();
    }

    public int operate(int num, int divisor, String value, StringBuilder result) {
        int count = num / divisor;
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                result.append(value);
            }
            num -= divisor * count;
        }
        return num;
    }


    /**
     * 方法三
     */
    private final TreeMap<Integer, String> MAP = new TreeMap<Integer, String>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};


    public String intToRoman3(int num) {
        if (num < 1) {
            return "";
        }
        int reduce = MAP.floorKey(num);
        return MAP.get(reduce) + intToRoman(num-reduce);
    }

    public static void main(String[] args) {
        IntegertoRoman to = new IntegertoRoman();
        System.out.println(to.intToRoman(3));
        System.out.println(to.intToRoman(4));
        System.out.println(to.intToRoman(9));
        System.out.println(to.intToRoman(5));
        System.out.println(to.intToRoman(8));
        System.out.println(to.intToRoman(1994));

    }

}
