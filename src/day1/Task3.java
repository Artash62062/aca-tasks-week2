package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        inputNum = scanner.nextInt();
        int i=1;
        while(Math.pow(i,2)<inputNum) {
            System.out.println((int)Math.pow(i,2));
            i++;
        }
    }
}
