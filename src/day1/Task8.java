package day1;

import java.util.Scanner;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task8 {
    public static void main(String[] args) {
        int counter =0;
        int num;
        int reminder =1;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);

        while (!flag) {
            num = scanner.nextInt();
            while (num>2) {
                flag = true;
                if(num %2 ==1){
                    flag = false;
                    break;
                }
                num /=2;
            }

            counter ++;
        }

        System.out.println(counter);
    }
}
