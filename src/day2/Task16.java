package day2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Pattern A");
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("");

        System.out.println("Pattern B");
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("Pattern C");
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        System.out.println("Pattern D");
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
