package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task14 {
    public static void main(String[] args) {
        int x;
        int p;
        int y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        p = scanner.nextInt();
        y = scanner.nextInt();
        int counter = 0;
        while(x<y) {
            x += x*p/100;
            counter ++;
        }
        System.out.println(counter);

    }
}
