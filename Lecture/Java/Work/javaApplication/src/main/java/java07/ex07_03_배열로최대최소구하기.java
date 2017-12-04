package java07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex07_03_배열로최대최소구하기 {
    
    public static void main(String[] args) {
        
        // 배열 생성 및 초기화
        
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50, 64 };
        
        // 배열 정렬 전 배열 값 출력
        
        System.out.print("배열 정렬 전 : ");
        printArray(arr);
        
        // java.util.Arrays.sort 메소드를 이용하여 정렬
        Arrays.sort(arr);
        
        // 배열 정렬 후 배열값 출력
        System.out.print("배열 정렬 후 : ");
        printArray(arr);
        // 최소값을 출력
        System.out.println("최소값 : " + arr[0]);
        
        // 최대값을 출력
        System.out.println("최대값 : " + arr[arr.length - 1]);
    }
    
    private static void printArray(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i = i + 1) {
            // i=0, arr[0]
            // i=1, arr[1]
            // i=2, arr[2]
            // i=3, arr[3]
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.println("!");
                
            } else {
                System.out.print(", ");
            }
            
        }
    }
}
