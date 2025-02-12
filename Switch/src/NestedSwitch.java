import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int empID = x.nextInt();
        String department = x.next();

//        switch (empID){
//            case 1:
//                System.out.println("Nitya");
//                break;
//            case 2:
//                System.out.println("Emp2");
//                break;
//            case 3:
//                System.out.println("Emp Number 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                    default:
//                        System.out.println("No Department");
//                }
//                break;
//            default:
//                System.out.println("Enter correct Employ ID");
//        }


        //enhanced switch case
        switch (empID) {
            case 1 -> System.out.println("Nitya");
            case 2 -> System.out.println("Emp2");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("Enter correct Employ ID");
        }
    }
}
