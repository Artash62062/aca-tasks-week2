package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the arr size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("input the arr");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("input the k ");
        int k = scanner.nextInt();
        for (int i = k; i < arr.length - 1; i++) {
            int swapNum = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = swapNum;
        }

        for (int i = 0; i <  arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
