package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the Arr size");
        int arrSize = scanner.nextInt();
        int [] arr = new int[arrSize];
        System.out.println("input the array");
        for (int i = 0; i < arrSize ; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest=0;
        int largestIndex=0;
        for (int i = 0; i < arrSize ; i++) {
            if(arr[i]>largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }

        System.out.println("Largest is" + largest);
        System.out.println("index of largest is" + largestIndex);

    }
}
