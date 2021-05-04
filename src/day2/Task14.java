package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i <num ; i++) {
            if(i%2==0){
                System.out.print(" ");
            }
            for (int j = 0; j < num ; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
