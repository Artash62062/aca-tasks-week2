package day3;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arr Size");
        int arrSize = scanner.nextInt();
        int [] arr = new int[arrSize];
        for (int i = 0; i < arrSize ; i++) {
            arr[i] = scanner.nextInt();
        }
        int previous =arr[0];
        int count =1;
        for (int i = 0; i <arrSize ; i++) {
            if(arr[i]!= previous){
                previous = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
