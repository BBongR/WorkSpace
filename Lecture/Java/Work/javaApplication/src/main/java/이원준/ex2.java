package 이원준;

import java.util.Arrays;

public class ex2 {
    public static void getBefore(int[] arr) {
        System.out.println("정렬전: " + Arrays.toString(arr));

    }
    
    public static void getAfter(int[] arr) {
        System.out.println("정렬후: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50 };

        getBefore(arr);
        Arrays.sort(arr);
        getAfter(arr);

    }

}
