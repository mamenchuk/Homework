package HomeWork;

import java.util.Scanner;

public class HomeWork4_Pract1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("unput number a");
        int a = scanner.nextInt();
        System.out.println("input number b");
        int b = scanner.nextInt();
        System.out.println("input c");
        int c = scanner.nextInt();


//           ето без верхнего блока со сканером
//        int a = 10;
//        int b = 13;
//        int c = 18;


        if (a % 2 == 0) {
            System.out.println("even number " + a);
        } else { ;
        System.out.println(someMethod());

        if (b % 2 == 0) {
            System.out.println("even number " + b);
        } else {
        System.out.println("odd number " + b);

        if (c % 2 == 0) {
            System.out.println("even number " + c);
        } else if (c != 0) ;
        System.out.println(someMethod());
    }

    public static String someMethod() {
        return "odd number ";
    }
}

