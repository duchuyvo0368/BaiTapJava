import java.util.Scanner;

public class Bai25 {
    private static int UCLN(int a, int b) {
        int tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    private static int BCNN(int a, int b) {
        int value=UCLN(a,b);
        return (a*b)/value;//vì UCLN(a,b)*BCNN(a,b)=a*b
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so a:\n");
        int a=scanner.nextInt();
        System.out.println("nhap so b\n");
        int b=scanner.nextInt();
        System.out.println("Uoc chung lon nhat"+UCLN(a,b));
        System.out.println("Boi chung lon nhat"+BCNN(a,b));
    }
}