package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the Size of array");
        int arrSize = scanner.nextInt();
        int [] arr = new int[arrSize];
        for (int i = 1; i < arr.length-1 ; i++) {
            if(arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
