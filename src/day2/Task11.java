package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOfPositive = 0;
        int countOfNegative = 0;
        int countOfZeros = 0;
        int num;
        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num > 0) {
                countOfPositive++;
            } else if (num < 0) {
                countOfNegative++;
            } else {
                countOfZeros++;
            }
        }
        System.out.println(countOfZeros);
        System.out.println(countOfPositive);
        System.out.println(countOfNegative);
    }
}
