package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task12 {
    public static void main(String[] args) {
        int fibFirst = 0;
        int fibSecond = 1;
        int fibThird = fibFirst + fibSecond;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isFibNum = false;
        int counter = 0;
        if (num == 0) {
            System.out.println(1);
        } else {
            while (fibThird <= num) {
                fibThird = fibFirst + fibSecond;
                if (fibThird == num) {
                    isFibNum = true;
                }
                fibFirst = fibSecond;
                fibSecond = fibThird;
                counter++;
            }
            if(isFibNum) {
                System.out.println(counter);
            } else {
                System.out.println(-1);
            }
        }
    }
}
