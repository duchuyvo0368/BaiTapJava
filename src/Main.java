import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisibleBy5(int num) {
        return num % 5 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n = scan.nextInt();

        if (n >= 100000) {
            System.out.println("Số nhập vào phải nhỏ hơn 5 chữ số");
            return;
        }

        int sum = 0;
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            if (isPrime(i)) {
                primeCount++;
            }
        }

        System.out.println("Tổng các số chẳn nhỏ hơn n: " + sum);
        System.out.println("Số lượng số nguyên tố nhỏ hơn n: " + primeCount);
        System.out.println("Số nguyên n có chia hết cho 5 không: " + isDivisibleBy5(n));
    }
}
