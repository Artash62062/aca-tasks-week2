package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the arr size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];

        System.out.println("input the arr");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isIncreasing =true;
        boolean isDecreasing = true;
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]) {
                isIncreasing =false;
            }
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]) {
                isDecreasing =false;
            }
        }

        if(isIncreasing||isDecreasing) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array isn't sorted");
        }
    }
}
