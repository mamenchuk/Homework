package HomeWork;

import java.util.Scanner;

public class HomeWork4_Pract2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unput day number");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {

            case 1:
                System.out.println("1, Mond., ПH.");
                break;
            case 2:
                System.out.println("2, Tue, BT.");
                break;
            case 3:
                System.out.println("3, Wed.,CP.");
                break;
            case 4:
                System.out.println("4,Thu, ЧТ.");
                break;
            case 5:
                System.out.println("5, Fri., ПТ");
                break;
            case 6:
                System.out.println("6, Sat., СБ.");
                break;
            case 7:
                System.out.println("7, Sun., ВС.");
                break;
        }
    }



    }
