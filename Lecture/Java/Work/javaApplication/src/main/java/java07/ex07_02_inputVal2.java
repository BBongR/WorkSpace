package java07;

import java.util.Scanner;

public class ex07_02_inputVal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 값을 입력하세요 : "); // 입력하는 창 띄우기
        int y = sc.nextInt(); // 입력
        
        int[] numbers = new int[y]; // 위에서 입력 받은 수 만큼 배열 지정.
        {
            
            for (int i = 0; i <= numbers.length - 1; i = i + 1) {
                System.out.print(i + 1 + " 번째 숫자를 입력하시오 : "); // 배열에 들어 갈 값 입력. 3번 반복 출력되게 중간에 낑김
                numbers[i] = sc.nextInt(); // [i] = 입력값
                
            }
            
            for (int j = 0; j <= numbers.length - 1; j = j + 1) {
                
                System.out.print("[" + numbers[j] + "]"); // 배열 값 출력
                if (j < numbers.length - 1) {
                    System.out.print(", ");
                    
                } else {
                    System.out.print("");
                }
                
            }
        }
    }
}
