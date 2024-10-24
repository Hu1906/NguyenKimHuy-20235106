package Triangle;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the triangle");
             int n = sc.nextInt();
        displayTriangle A = new displayTriangle(n);
        A.display();
    }
}
