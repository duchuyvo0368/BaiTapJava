import java.util.Scanner;

public class Bai30 {
    private static long tinh(int n) {
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + (2 * i + 1);
        }
        return s;
    }

    private static void kiemTra(int n) {
        if (n < 0)
            System.out.println("gia tri kho hop le");
        else
            System.out.println("gia tri cua (2n+1) la: " + tinh(n));
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("nhap so n: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            kiemTra(n);
        } while (n < 0);
    }

}