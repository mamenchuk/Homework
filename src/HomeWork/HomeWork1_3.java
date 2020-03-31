package HomeWork;

import java.util.Scanner;

public class HomeWork1_3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Did you make a call to c1?");
        String answer = scanner.nextLine();
        System.out.println("How many minutes it was?");
        String answer1 = scanner.nextLine();

        System.out.println("Did you make a call to c2?");
        String answer2 = scanner.nextLine();
        System.out.println("How many minutes it was?");
        String answer2_2 = scanner.nextLine();

        System.out.println("Did you make a call to c3?");
        String answer3 = scanner.nextLine();
        System.out.println("How many minutes it was?");
        String answer3_3 = scanner.nextLine();

        int c1 = (5);
        int c2 = (10);
        int c3 = (15);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();

        int call_1 = (c1 * t1);
        int call_2 = (c2 * t2);
        int call_3 = (c3 * t3);

        int total_cost = (call_1 + call_2 + call_3);

        System.out.println("c1 costed " + "call_1");
        System.out.println("c2 costed " + "call_2");
        System.out.println("c3 costed " + "call_3");
        System.out.println("Total cost for three calls is " + "total_cost" + "Gonna Pay ;)");


    }
}
