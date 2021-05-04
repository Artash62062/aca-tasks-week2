package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the B :");
        int numA = scanner.nextInt();
        System.out.print("input the B :");
        int numB = scanner.nextInt();
        System.out.print("input the C :");
        int numC = scanner.nextInt();
        System.out.print("input the D :");
        int numD = scanner.nextInt();

        for (int i = numA; i <=numB ; i++) {
            if(i%numD == numC) {
                System.out.println(i);
            }
        }
    }
}
