package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task6 {
    public static void main(String[] args) {
        int inputNum;
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();
        int i=inputNum;
        while (i>0) {
            System.out.println(i);
            i--;
        }
    }
}
