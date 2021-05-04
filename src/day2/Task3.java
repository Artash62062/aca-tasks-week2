package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number A :");
        int numA = scanner.nextInt();
        System.out.print("Input the number B :");
        int numB = scanner.nextInt();
        for (int i = 0; i <=numB ; i++) {
            if (numA<=i*i && i*i<=numB){
                System.out.println(i*i);
            }
        }
    }
}
