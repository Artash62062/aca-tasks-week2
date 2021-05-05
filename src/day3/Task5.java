package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the array size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Input the Array elements");
        for (int i = 0; i < arrSize ; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i <arrSize-1 ; i++) {
            if((arr[i]>=0&&arr[i+1]>=0) || (arr[i]<0&&arr[i+1]<0 )) {
                System.out.println(arr[i] +" "+ arr[i+1]);
                break;
            }
        }
    }
}
