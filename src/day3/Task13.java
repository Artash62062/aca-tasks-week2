package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the arr size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("input the arr");
        for (int i = 0; i < arrSize ; i++) {
            arr[i] = scanner.nextInt();
        }

        int max=arr[0];
        int maxIndex=0;
        int min=arr[0];
        int minIndex =0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max) {
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i]<min) {
                min = arr[i];
                minIndex =i;
            }
        }
        int swapValue = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = swapValue;
    }
}
