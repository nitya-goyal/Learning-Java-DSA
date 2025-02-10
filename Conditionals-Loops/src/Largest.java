import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        //Q:Find largest of the 3 numbers
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
