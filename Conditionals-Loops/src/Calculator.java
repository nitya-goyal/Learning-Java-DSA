import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //Take input until X or x is pressed
        int ans = 0;
        while (true){
            System.out.println("Enter operator: ");
            char op = x.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter numbers");
                int n1 = x.nextInt();
                int n2 = x.nextInt();
                if (op == '+'){
                    ans = n1 + n2;
                }
                if (op == '-'){
                    ans = n1 - n2;
                }
                if (op == '*'){
                    ans = n1 * n2;
                }
                if (op == '/'){
                    if (n2 != 0) {
                        ans = n1 / n2;
                    } else {
                        System.out.println("Can't divide by Zero");
                    }
                }
                if (op == '%'){
                    ans = n1 % n2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
            System.out.println(ans);
        }
    }
}
