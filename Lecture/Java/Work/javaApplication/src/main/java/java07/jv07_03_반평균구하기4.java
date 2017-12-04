package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_03_반평균구하기4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(i + 1 + "번째 값: ");
            arr[i] = sc.nextInt();
        }
        
        // System.out.print(Arrays.toString(arr));
        
        System.out.print("[");
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
            
        }
        System.out.print("]");
    }
    
}
