package day1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task16 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the Number");
        int guessNum = scanner.nextInt();
        while (guessNum!=num) {
            if(guessNum>num){
                System.out.println("Too High Try again");
            } else {
                System.out.println("Too Low Try again");
            }
            guessNum= scanner.nextInt();
        }
        System.out.println("Congrats You Guessed the Number");
    }
}
