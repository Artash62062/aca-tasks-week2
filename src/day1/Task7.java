package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if(inputNum%2!=0) {
            inputNum--;
        }
        for (int i = inputNum; i >1; i-=2) {
            System.out.println(i);
        }
    }
}
