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
        int i=2;
        while (i<=inputNum) {
            if(inputNum % i ==0) {
                smallest = i;
                break;
            }
            i++;
        }
        System.out.println(smallest);
    }
}
