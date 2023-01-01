import java.util.Scanner;

public class Bai31 {
    private static int tinhLuyThua(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = (int) ( s + Math.pow(-1, i+1) * i);//(int) ep kieu
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap so n ");
        int n=scanner.nextInt();
        System.out.println("gia tri cua luy thua "+tinhLuyThua(n));
    }
}
