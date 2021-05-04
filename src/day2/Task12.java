package day2;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/4/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count =0;
        int j =0 ;
        int tempNum =1;
        for (int i =1 ; i <=num ; i++) {
            for (j=0; j<i; j++) {
                System.out.println(tempNum);
                count++;
                if(count == num) {
                    break;
                }
            }
            if(count == num) {
                break;
            }
            tempNum++;
        }
    }
}
