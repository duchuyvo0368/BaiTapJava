import java.util.Scanner;

public class Bai32 {
    private static int tinhGiaTriS(int n) {
        int p = 1,s=0;
        for (int i = 1; i <= n; i++) {
            p = p + p * (i - 1);
            s=s+p;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n ");
        int n = scanner.nextInt();
        System.out.println("gia tri cua S=  " + tinhGiaTriS(n));
    }
}
