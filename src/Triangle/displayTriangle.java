package Triangle;

public class displayTriangle {

    private int n;
    public displayTriangle(int n) {
        this.n = n;
    }
    public void display() {
        int countStar = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= countStar; k++){
                System.out.print("*");
            }
            countStar += 2;
            System.out.println();
        }

    }
}
