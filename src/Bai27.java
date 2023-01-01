import java.util.Scanner;

public class Bai27 {
    private static void kiemTraSoHoanThien(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                temp = temp + i;
            }
        if (temp == n) {
            System.out.println("So " + n + " la so hoan thien");
        } else {
            System.out.println("So " + n + " khong phai la so hoan thien");
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("nhap so n: ");
        int n=scanner.nextInt();
        kiemTraSoHoanThien(n);
    }
}
