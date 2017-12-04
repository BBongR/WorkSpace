package java04;

import java.util.Scanner;

public class ex04_04_for실습예제 {
    public static void main(String[] args) { // 메인 메서드
        Scanner sc = new Scanner(System.in); // 키보드와 프로그램 연결
        int A, B;
        int sum = 0;
        
        System.out.print("시작값을 입력하세요 : ");
        A = sc.nextInt(); // 정수 입력받고 A에 저장
        System.out.print("종료값을 입력하세요 : ");
        B = sc.nextInt(); // 정수 입력 받고 B에 저장
        
        if (A > B) /*
                    * 시작값이 종료값보다 큰 경우 for 문에서 n부터 n까지 더하려면 최대 기준점 필요.
                    */
        {
            for (int i = B; i <= A; i = i + 1) {
                sum += i;
            }
        }
        
        else // A가 B보다 작을 경우 여기서 실행
        {
            for (int i = A; i <= B; i = i + 1) {
                sum += i;
            }
        }
        
        System.out.println(A + " 부터 " + B + " 까지의 합: " + sum);
    }
    
}
