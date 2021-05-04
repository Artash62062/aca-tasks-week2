package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= num ; j++) {
                System.out.print(j * i + " ");
            }
            System.out.print("\n");
        }
    }
}
