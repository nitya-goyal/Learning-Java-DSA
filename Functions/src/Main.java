import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n1, n2, sum;

        System.out.print("Enter n1: ");
        n1 = x.nextInt();
        System.out.print("Enter n2: ");
        n2 = x.nextInt();
        sum = n1 + n2;
        System.out.println("Sum=" + sum);
    }
}