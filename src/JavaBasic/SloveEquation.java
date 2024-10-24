package JavaBasic;//Example 6: Write a program to solve

import javax.swing.JOptionPane;

public class SloveEquation {

    public static double checkstrNum1(double a){
        while (a == 0){
            JOptionPane.showMessageDialog(null, "a invalid!");
            String strNum3 = JOptionPane.showInputDialog(null, "Enter a number again: ");
            a = Double.parseDouble(strNum3);
        }
        return a;
    }
    public static void firstDegreeEquation1V(){

        String strNum1 = JOptionPane.showInputDialog("Enter a: ");
        double num1 = Double.parseDouble(strNum1);
        num1 = checkstrNum1(num1);
        String strNum2 = JOptionPane.showInputDialog("Enter b: ");
        double num2 = Double.parseDouble(strNum2);

        JOptionPane.showMessageDialog(null, "Your equation: " + num1 + "x + " + num2 + " = 0");
        JOptionPane.showMessageDialog(null, "x = " + (-num2 / num1));
    }

    public static void secondDegreeEquation(){
        String strNum1 = JOptionPane.showInputDialog("Enter a: ");
        double num1 = Double.parseDouble(strNum1);
        num1 = checkstrNum1(num1);
        String strNum2 = JOptionPane.showInputDialog("Enter b: ");
        double num2 = Double.parseDouble(strNum2);
        String strNum3 = JOptionPane.showInputDialog("Enter c: ");
        double num3 = Double.parseDouble(strNum3);
        double D = Math.pow(num2, 2) - 4 * num1 * num3;
        if (D > 0){
            JOptionPane.showMessageDialog(null,
                    "x1 = " + ((-num2 + Math.sqrt(D))/2 * num1) + " x2 = " + ((-num2 - Math.sqrt(D))/2 * num1));
        } else if (D == 0){
            JOptionPane.showMessageDialog(null, "x1 = x2 = " + -num2/(2 * num1));
        } else {
            JOptionPane.showMessageDialog(null, "Equation with no solution");
        }

    }

    public static void firstDegreeEquation2V(){
        String strNum1 = JOptionPane.showInputDialog("Enter a: ");
        double num1 = Double.parseDouble(strNum1);
        String strNum2 = JOptionPane.showInputDialog("Enter b: ");
        double num2 = Double.parseDouble(strNum2);
        String strNum3 = JOptionPane.showInputDialog("Enter c: ");
        double num3 = Double.parseDouble(strNum3);
        String strNum4 = JOptionPane.showInputDialog("Enter d: ");
        double num4 = Double.parseDouble(strNum4);
        String strNum5 = JOptionPane.showInputDialog("Enter e: ");
        double num5 = Double.parseDouble(strNum5);
        String strNum6 = JOptionPane.showInputDialog("Enter f: ");
        double num6 = Double.parseDouble(strNum6);

        double D = num1 * num5 - num2 * num4;

        if (D == 0){
            JOptionPane.showMessageDialog(null, "System of equations with no solutions!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "x1 = " + (num3 * num5 - num6 * num4)/D + " x2 = " + (num1 * num6 - num2 * num3)/D);
        }
    }

    public static void main(String[] args) {
        String check = JOptionPane.showInputDialog(null,
                "Select the type of equation you want to solve!(Fill in 1 to 3) \n 1.The first-degree equation  with one variable \n " +
                        "2.The system of first-degree equations with two variables \n 3.The second-degree equation with one variable");
        int icheck = Integer.parseInt(check);
        if (icheck == 1){
            firstDegreeEquation1V();
        }
        if (icheck == 2){
            firstDegreeEquation2V();
        }
        if (icheck == 3){
            secondDegreeEquation();
        }
    }
}