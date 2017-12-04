package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기2 {
    
    public static void main(String[] args) {
        
      /*실행결과
        배열의 크기를 입력하시오 : 3
        입력: 35
        입력: 45
        입력: 55
        배열의 값: 35, 45, 55*/
        
        Scanner sc = new Scanner(System.in); // 키보드와 프로그램 연결
        
        System.out.print("배열의 크기를 입력하시오: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print("입력: "); // 사용자를 위한 텍스트 출력
            arr[i] = sc.nextInt(); // 정수를 입력 받아 arr배열에 순서대로 입력
        }
        // 배열 값 출력
        System.out.print("배열의 값: ");
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                
            } else
                System.out.print(", ");
        }
    }
    
}
