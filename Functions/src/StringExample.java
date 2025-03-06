import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = x.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "Hi";
        return greeting;
    }
}
