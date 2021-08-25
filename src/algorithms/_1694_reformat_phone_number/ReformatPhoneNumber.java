package algorithms._1694_reformat_phone_number;

/**
 * ** Created by peter.guan on 2021/08/24.
 *
 * @author peter.guan
 */
public class ReformatPhoneNumber {

    public String reformatNumber(String number) {

        number = number.replaceAll(" ", "").replaceAll("-", "");
        StringBuilder builder = new StringBuilder();
        int count = 0;
        if (number.length() % 3 == 0) {
            for (int i = 0; i < number.length(); i++) {
                builder.append(number.charAt(i));
                count++;
                if (count == 3 && i != number.length()) {
                    builder.append("-");
                    count = 0;
                }
            }
        } else if (number.length() % 3 == 1) {
            for (int i = 0; i < number.length() - 4; i++) {
                builder.append(number.charAt(i));
                count++;
                if (count == 3) {
                    builder.append("-");
                    count = 0;
                }
                builder.append(number.charAt(number.length() - 4));
                builder.append(number.charAt(number.length() - 3));
                builder.append("-");
                builder.append(number.charAt(number.length() - 2));
                builder.append(number.charAt(number.length() - 1));
            }
        } else {
            for (char c : number.toCharArray()) {
                builder.append(c);
                count++;
                if (count == 3) {
                    builder.append("-");
                    count = 0;
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String a = "1-23-45 6";
        a = a.replaceAll(" ", "").replaceAll("-", "");
        System.out.println(a);
    }

}
