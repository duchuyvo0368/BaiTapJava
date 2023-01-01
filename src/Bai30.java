import java.util.Scanner;

public class Bai30 {
    private static long tinh(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + (2 * i + 1);
        }
        return s;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("nhap so n: ");
            n = scanner.nextInt();
            if (n < 0)
                System.out.println("gia tri kho hop le");
            else
                System.out.println("gia tri cua (2n+1) la: " + tinh(n));
        } while (n < 0);

    }
}