package day3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the arr size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        int[] arrNoZero = new int[arrSize];
        System.out.println("input the arr");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        int count =0;
        for (int i = 0; i < arrSize; i++) {
            if(arr[i]==0) {
                count++;
            } else if(count!=0) {
                arr[i-count]= arr[i];
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
