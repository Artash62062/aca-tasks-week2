package day3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the size of arr");
        int arrSize = scanner.nextInt();
        int [] arr = new int[arrSize];
        for (int i = 0; i <arrSize ; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }


    }
}
