package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int numLength = String.valueOf(num).length();
        int revNum = 0;
        for (int i = 0;num>0; i++) {
            int temp = num%10;
            revNum += Math.pow(10,numLength-i-1) *temp;
            num/=10;
        }
        System.out.println(revNum);
    }
}
