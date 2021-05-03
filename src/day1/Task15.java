package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int max = 0;
        int min = 0;
        while(num!=0) {
            if(num >max) {
                min =max;
                max = num;
            } else if(num > min) {
                min = num;
            }
            num = scanner.nextInt();
        }
        System.out.println(min);
    }
}
