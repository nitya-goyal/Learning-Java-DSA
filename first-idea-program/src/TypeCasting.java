import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
//        float num = x.nextFloat();
//        System.out.println(num);

//        type casting
//        int num = (int)(67.56f);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);// 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        byte f = 50;
//        f = f * 2;//Error

//        int number = 'A';
//        System.out.println(number); //Output is 65(ASCII Value of 'A')

//        System.out.println(3 * 316176.234f);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i /c) - (d * s);
        System.out.println((f * b)+ " " + (i /c) + " " + (d * s));
        System.out.println(result);
    }
}
