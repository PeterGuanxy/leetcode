package algorithms._1185_day_of_the_week;

/**
 * ** Created by peter.guan on 2021/08/06.
 *
 * @author peter.guan
 */
public class DayOfTheWeek {
    // "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

    public String dayOfTheWeek(int day, int month, int year) {

        int m[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int y = 1971;
        int amount = 0;
        while (year > y) {
            amount += 365;
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
                amount++;
            }
            y++;
        }
        amount += m[month - 1];
        if (month > 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            amount++;
        }
        amount += day;

        switch (amount % 7) {
            case 0:
                return "Thursday";
            case 1:
                return "Friday";
            case 2:
                return "Saturday";
            case 3:
                return "Sunday";
            case 4:
                return "Monday";
            case 5:
                return "Tuesday";
            case 6:
                return "Wednesday";
        }
        return null;

    }

}
