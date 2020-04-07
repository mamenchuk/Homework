package PracticalTasks;

public class Sorting {
    public static void main(String[] args) {
        int[] items = {1, -2, 3, 4, -5, 11, 7, -8, 9, 10};
        int tmp;
        for(int i = 0; i < items.length -1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] < items[j]) {
                    tmp = items[i];
                    items[i] = items[j];
                    items[j] = tmp;
                }
            }
            System.out.println(Arrays.toString(items));
        }
        System.out.println("-----------------------------------");
        System.out.println(Arrays.toSting(items));

    }

    }
