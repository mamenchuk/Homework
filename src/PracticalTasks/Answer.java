package PracticalTasks;

import java.util.Scanner;

public class Answer {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);

    }
}
