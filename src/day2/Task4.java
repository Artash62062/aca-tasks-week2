package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the number x");
        int numX = scanner.nextInt();
        System.out.println("input the number y");
        int numD = scanner.nextInt();
        int counter = 0;
        for (;numX>0 ;) {
            int temp = numX%10;
            numX = numX/10;
            if (numD == temp){
                counter++;
            }
        }

        System.out.println(counter);

    }

}
