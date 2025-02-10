import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        char ch = x.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
