// Example 5: Write a program to calculate sum, difference,
// product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;

public class CalculateTwoDouble {
    public static void main(String[] args){

        String strNum1 = JOptionPane.showInputDialog("Enter First Number");
        String strNum2 = JOptionPane.showInputDialog("Enter Second Number");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2));

    }
}