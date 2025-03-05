import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int c = x.nextInt();
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == c){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
