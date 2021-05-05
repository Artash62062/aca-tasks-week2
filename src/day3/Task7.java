package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        System.out.println("input the arr size");
        int[] arr = new int[arrSize];
        System.out.println("input the arr");
        for (int i = 0; i < arrSize ; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 0;
        for (int i = 0; i < arrSize - 1; i++) {
            if (arr[i] > 0 && arr[i] > min) {
                min = arr[i];
            }
        }
    }
}
