package algorithms._1154_day_of_the_year;

/**
 * ** Created by peter.guan on 2021/07/19.
 *
 * @author peter.guan
 */
public class DayOfTheYear {

    public int dayOfYear(String date) {
        int[] monthDays = new int[]{0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int year = Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7));
        int day = Integer.valueOf(date.substring(8, 10));
        if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month > 2) {
            return monthDays[month - 1] + day + 1;
        }

        return monthDays[month - 1] + day;
    }


}
