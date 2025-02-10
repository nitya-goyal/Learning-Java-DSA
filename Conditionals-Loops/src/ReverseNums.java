import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int r = 0;
        while (n>0){
            r = (r*10) + (n%10);
            n /= 10;
        }
        System.out.println(r);
    }
}
