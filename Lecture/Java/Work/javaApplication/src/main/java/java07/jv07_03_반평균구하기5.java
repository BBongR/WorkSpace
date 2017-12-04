package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_03_반평균구하기5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열의 크기 입력: ");
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        for(int i=0; i<arr.length; i=i+1){
            System.out.print(i+1+"번째 입력: ");
            arr[i]=sc.nextInt();
        }
        
        /*for(int j=0; j<arr.length; j=j+1){
            System.out.print(arr[j]);
            if(j<arr.length-1)
                System.out.print(", ");
        }*/
        
        System.out.print(Arrays.toString(arr));  // 위 주석처리를 간단하게
    }                                            // 배열 출력을 해주는 기능
    
}
