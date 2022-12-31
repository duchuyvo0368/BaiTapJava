import java.util.Scanner;

public class Bai26 {
    private static int demSoUoc(int a){
        int n=0;
        for (int i=1;i<a;i++){
            if((a % i)==0){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap so a:");
        int a=scanner.nextInt();
        System.out.println("so uoc cua "+a+" là: "+demSoUoc(a));;
    }
}
