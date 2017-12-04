package java04;

import java.util.Scanner;

public class ex04_14_무한구구단 {
    public static void main(String[] args) {
        
        /*
         * 시작 단수와 종료 단수를 입력 받고, 해당 단에 해당하는 구구단을
         * 출력하는 프로그램을 작성하시오 시작단이 종료단 보다 큰 경우에도
         * 가능하게 하시오 출력은 작은 단부터 큰단 순으로 구구단을
         * 출력하시오 입력 받는 정수에 0이 있는 경우에만 프로그램을
         * 종료하고 아니면 계속 새로운 시작단과 종료단을 입력 받아
         * 출력하게 하시오
         */
        
        Scanner sc = new Scanner(System.in);
        
        int start = 0, end = 0;
        int result = 0;
        int temp;
        for (;;) {
            System.out.print("시작 단: ");
            start = sc.nextInt();
            System.out.print("종료 단: ");
            end = sc.nextInt();
            
            if (start == 0 || end == 0) {
                System.out.print("종료");
                break;
            }
            
            if (start > end) { // 종료값이 시작값보다 크다면
                temp = start; // 종료값을 temp임시 변수에 저장
                start = end; // 시작값을 종료값에 저장
                end = temp; // 종료값을 임시로 저장해논 temp값을
            }
            
            for (int i = start; i <= end; i = i + 1) {
                for (int j = 1; j <= 9; j = j + 1) {
                    
                    result = i * j;
                    System.out.println(i + "*" + j + "=" + result);
                }
                System.out.println();
            }
            
        }
    }
}
