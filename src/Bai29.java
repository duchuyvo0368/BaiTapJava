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
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap so n:");
        int n=scanner.nextInt();
        System.out.println("gia tri cua (2n+1) la:"+tinh(n));
    }
}