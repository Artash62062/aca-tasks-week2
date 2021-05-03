package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
/* For a given natural N print the smallest integer k that`
 Math.pow(2,k)≥N*/
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner .nextInt();
        int answer=0;
        for (int i=0;Math.pow(2,i)<=num;i++){
            answer =i;
        }
        System.out.println(++answer);
    }
}
