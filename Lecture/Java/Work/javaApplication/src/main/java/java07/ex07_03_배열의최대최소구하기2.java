package java07;

import java.util.Arrays;

public class ex07_03_배열의최대최소구하기2 {
    
    public static void main(String[] args) {
        
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50, 64 };
        
        System.out.print("배열 전: ");
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {   // i가 배열 마지막 방 인덱스보다 작을때까지
                System.out.print(", "); // ,를 써주고
            } else {                    // 그렇지 않으면
                System.out.print(".");  // 배열 마지막 방 뒤에 .를 해준다
            }
        }
        System.out.println();
        
        Arrays.sort(arr);
        
        System.out.print("배열 후: ");
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
        
        System.out.println();
        
        System.out.println("최대값 : " + arr[arr.length - 1]);
        System.out.println("최소값 : " + arr[0]);
    }
    
}
