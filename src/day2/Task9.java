package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task9 {
    public static void main(String[] args) {
        int sum =0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            sum+= scanner.nextInt();
        }
        System.out.println(sum);
    }
}
