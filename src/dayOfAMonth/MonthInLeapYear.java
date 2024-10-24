package dayOfAMonth;

public class MonthInLeapYear extends MonthInCommonYear {


    public MonthInLeapYear(String month) {
        super(month);
    }

    @Override
    public void getDay(){
        switch (month) {
            case "January": case "Jan.": case "Jan": case "1": case "March": case "Mar.": case "Mar": case "3": case "May"
                    :case "5": case "July": case "Jul": case "7": case "Augus": case "Aug.": case "Aug": case "8": case "October"
                    : case "Oct.": case "Oct": case "10": case "December": case "Dec.": case "Dec": case "12":
                System.out.println("31");
                break;
            case "February":
                System.out.println("29");
                break;
            case "April": case "Apr.": case "Apr": case "4": case "June": case "Jun": case "6": case "September": case "Sept."
                    : case "Sep": case "9": case "November": case "Nov.": case "Nov": case "11":
                System.out.println("30");
                break;
        }
    }
}
