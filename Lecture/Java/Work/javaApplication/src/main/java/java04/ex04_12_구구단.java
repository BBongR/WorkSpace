package java04;

import java.util.Scanner;

public class ex04_12_구구단 {
    public static void main(String[] args) {
        
        /*
         * 시작 단수와 종료 단수를 입력 받고, 해당 단에 해당하는 구구단을 출력하는 프로그램을 작성하시오 단, 시작단 값은 종료단 값 보다 작다
         * 
         * 실행예시 15 * 1 = 15, 15 * 2 = 30, 15 * 3 = 45, 15 * 9 = 135. 11 * 1 = 11, 11 * 2 = 22, 11 * 3 = 33, 11 * 9 = 99.
         * 12 * 1 = 12, 12 * 2 = 24, 12 * 3 = 36, 12 * 9 = 108. 11 * 1 = 11, 11 * 2 = 22, 11 * 3 = 33, 11 * 9 = 99.
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 단: ");
        int start = sc.nextInt();
        System.out.print("종료 단: ");
        int end = sc.nextInt();
        
        int temp;
        int result = 0;
        
        if (start > end) { // 종료값이 시작값보다 크다면
            temp = start; // 종료값을 temp임시 변수에 저장
            start = end; // 시작값을 종료값에 저장
            end = temp; // 종료값을 임시로 저장해논 temp값을
        }
        
        for (int i = start; i <= end; i = i + 1) {
            for (int j = 1; j <= 9; j = j + 1) {
                result = i * j;
                System.out.format("%d * %d = %d", i, j, result);
                if (j < 9)
                    System.out.print(", ");
                else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
    
}
