package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int smallest= 1;
        for (int i = 2;i<= inputNum ; i++) {
            if(inputNum % i ==0) {
                smallest = i;
                 break;
            }
        }
        System.out.println(smallest);
    }
}
