package day1;

/**
 * @author Artash-PC on 5/3/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Task10 {
    public static void main(String[] args) {
        for (int i = 32; i <= 122; i++) {
            System.out.print((char) i);
            if((i-2)%10==0){
                System.out.print("\n");
            }
        }
    }
}
