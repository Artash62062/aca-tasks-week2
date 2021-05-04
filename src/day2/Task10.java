package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binNum = scanner.nextLong();
        int binNumLength = String.valueOf(binNum).length();
        int decNum =0 ;
        for (int i = 0; i < binNumLength ; i++) {
            int temp = (int) (binNum%10);
            if(temp == 1) {
                decNum += Math.pow(2, i);
            }
            binNum/=10;
        }
        System.out.println(decNum);
    }
}
