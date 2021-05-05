package day3;

/**
 * @author Artash-PC on 5/5/2021
 * @product IntelliJ IDEA
 * @project aca_tasks_week_2
 */
public class Arrays {
    public static void main(String[] args) {
        int [] nums = new int[1000];
        int counter = 0;
        for (int i = 0; i <7000 ; i++) {
            if(i%7==0) {
                nums[counter] = i;
                counter++;
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
}
