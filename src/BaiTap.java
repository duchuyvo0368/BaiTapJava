import java.util.Scanner;

import static java.lang.System.*;

public class BaiTap {
    public static void main(String[] args) {
        out.println("nhap so n: ");
        Scanner scanner = new Scanner(in);
        String exercise = scanner.toString();
        //  System.out.println(printFib(n));

//        int c = 0;
//        for (int i = 1; i <= n; i++) {
//            System.out.println("\n" + fibonacci_series(c));
//            c++;
//        }


}

    private static int bai33(int n) {
        int s = 0, i = 1;
        while (i <= n) {
            s = (int) (s + Math.pow(i, 2));
            i++;
        }
        return s;
    }

    private static float bai34(int n) {
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (1 / (float) i);
        }
        return s;
    }

    private static int bai35(int n) {
        int s = 0, i = 1;
        while (i <= n) {
            s = (int) (s + Math.pow(i, i));
            i++;
        }
        return s;
    }

    private static float bai36(int n) {
        float s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (float) i / (i + 1);

        }
        return s;
    }

    private static float bai37(int n) {
        float s = 0, p = 1;
        for (int i = 1; i <= n; i++) {
            p = p + p * (i - 1);
            s = s + (float) 1 / p;
        }
        return s;
    }

    private static float bai38(int n) {
        int i = 1, p = 1, q = 0;
        float s = 0;
        while (i <= n) {
            p = p + p * (i - 1);
            q = q + i;
            s = s + (float) q / p;
            i++;
        }
        return s;
    }

    private static float bai39(int n) {
        int i = 1, p = 0;
        float s = 0;
        while (i <= n) {
            p = p + i;
            s = s + (float) 1 / p;
            i++;
        }
        return s;
    }

    private static float bai40(int x, int y) {
        int result = 1;
        while (y > 0) {
            result = result * x;
            y--;
        }
        return result;
    }

    private static int bai41(int n) {
        int i = 1;
        int s = 0;
        while (i <= n) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                temp = temp + j;
            }
            s = s + temp;
            i++;
        }
        return s;
    }

    private static int fibonacci_series(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return (fibonacci_series(num - 1) + fibonacci_series(num - 2));
    }
}
