import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <=n){
            int temp = a;
            a=b;
            b = b + temp;
//            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
