import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);
    }

    //pass the value of numbers when calling main() method
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    //return the value
    static int sum2(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = x.nextInt();
        System.out.print("Enter n2: ");
        int n2 = x.nextInt();
        int sum = n1 + n2;
        return sum;
    }
    static void sum() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = x.nextInt();
        System.out.print("Enter n2: ");
        int n2 = x.nextInt();
        int sum = n1 + n2;
        System.out.println("Sum=" + sum);
    }
    /*
    access modifier return_type name(arguments){
        //body
        return statement;
    }
     */
}
