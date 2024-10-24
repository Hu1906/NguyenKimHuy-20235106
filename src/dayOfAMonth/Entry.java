package dayOfAMonth;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        String month = sc.nextLine();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            MonthInLeapYear newMonth = new MonthInLeapYear(month);
            newMonth.getDay();
        } else {
            MonthInCommonYear newMonth = new MonthInCommonYear(month);
            newMonth.getDay();
        }

    }
}
