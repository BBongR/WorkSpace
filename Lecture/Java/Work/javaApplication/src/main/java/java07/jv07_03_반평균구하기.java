package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기 {
    public static void main(String[] args) {
        
        // 배열 만들기
        int size = 3;
        int[] array = new int[size];
        
        // 키보드 입력
        Scanner sc = new Scanner(System.in);
        
        // 입력 받아 배열에 저장
        int sum = 0;
        for (int i = 0; i <= array.length-1; i = i + 1) {
            
            System.out.print("숫자를 입력하세요 : "); // 사용자를 위한 텍스트 출력
            array[i] = sc.nextInt(); // 정수 입력 받아 x 공간에 저장.
            
        }
        // 배열 값 출력
        System.out.print("배열의 값은 : ");
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            System.out.print(array[i]);
            
            if (i == array.length - 1) {
                
            } else {
                System.out.print(", ");
            }
        }
        
    }
    
}
