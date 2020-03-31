package HomeWork;

import java.util.Scanner;

public class HomeWork1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Radius Value!");
        int R = scanner.nextInt();

        System.out.println("radius R = " + R);
        System.out.println("area S =  " + 3.14 * (R * R));
        System.out.println("perimetr P =  " + 2 * 3.14 * R);


        // виглядит крайне примитивно.
        // наверное, где-то нужно было прописать формулы))), и задать значение ПИ (хотя оно в джаве точно где-то есть!!!), (и ПИ в квадрате)


    }
}







