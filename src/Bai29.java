import java.util.Scanner;

public class Bai29 {
    private static long tinh(int n) {
        int p = 1;
        for (int i = 0; i <= n; i++) {
            p = p * (2 * i + 1);
        }
        return p;
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("nhap so n:");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("n phai la so lon hon 0");
            }
        } while (n < 0);
        System.out.println("gia tri cua (2n+1) la:" + tinh(n));
    }
}