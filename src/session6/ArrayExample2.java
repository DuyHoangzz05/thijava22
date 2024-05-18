package session6;

import java.sql.Array;
import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers =new int[]{5,10 ,15,1,9,8};
        Arrays.sort(numbers);
        for (int num : numbers){
            //System.out.println("Numbers:" + num);
        }
        String[] students = new String[]{"Hang","hoang","ha","hai"};
        for (String stu : students){
            System.out.println(stu);
        }
    }
}
