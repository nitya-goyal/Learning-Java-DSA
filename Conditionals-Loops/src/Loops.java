import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        /*
        Syntax of for loops:
        for (initialisation; condition; increment/decrement) {
            //body
        }
         */

        //Print from 1 to 5
//        for (int i=1; i != 6; i++){
//            System.out.println(i);
//        }
        //Print from 1 to n
        int n = x.nextInt();
//        for (int j=1; j<=n; j+=1){
//            System.out.print(j+" ");
//        }


        /*
        while loops syntax:
        while (condition){
            //body
        }
         */
//Print 1 to n using while loop
//        int k = 1;
//        while (k<=n){
//            System.out.print(k+" ");
//            k+=1;
//        }


        /*
        do while loop syntax:
            do{
                //body
            } while (condition);
         */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
