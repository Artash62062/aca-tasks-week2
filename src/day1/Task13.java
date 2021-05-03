package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the First day ");
        int x = scanner.nextInt();
        System.out.println("input the y");
        int y =scanner.nextInt();
        int count =0;
        while (x<y) {
            x+= x*10/100;
            count++;
        }
        System.out.println(--count);
    }
}
