package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task5 {
    public static void main(String[] args) {
        int inputNum;
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        int powOftwo = 1;
        int lastPow = 2;
        while (lastPow<inputNum) {
            System.out.println(lastPow);
            lastPow *=2;
            powOftwo ++;
        }

    }
}
