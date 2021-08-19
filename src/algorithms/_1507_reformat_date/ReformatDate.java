package algorithms._1507_reformat_date;

/**
 * ** Created by peter.guan on 2021/08/19.
 *
 * @author peter.guan
 */
public class ReformatDate {

    public String reformatDate(String date) {

        String[] dateArray = date.split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append(dateArray[2]).append("-").append(getMonth(dateArray[1])).append("-");
        if (dateArray[0].length() == 3) {
            builder.append("0").append(dateArray[0].substring(0, 1));
        } else {
            builder.append(dateArray[0].substring(0, 2));
        }
        return builder.toString();
    }

    public String getMonth(String month) {

        switch (month) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
            default:
                return "";
        }
    }
}
