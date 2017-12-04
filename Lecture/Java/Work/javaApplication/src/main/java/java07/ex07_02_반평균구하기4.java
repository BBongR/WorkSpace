package java07;

import java.util.Scanner;

public class ex07_02_반평균구하기4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하시오 : "); // 입력하는 창 띄우기
        int y = sc.nextInt(); // 입력
        int sum = 0; // 합계 넣을 변수 선언
        int avg = 0; // 평균 넣을 변수 선언.
        int[] numbers = new int[y]; // 위에서 입력 받은 수 만큼 배열 지정.
        {
            
            for (int i = 0; i <= numbers.length - 1; i = i + 1) {
                System.out.print("성적을 입력하시오 : "); // 배열에 들어 갈 값 입력. 3번 반복 출력되게 중간에 낑김
                numbers[i] = sc.nextInt(); // [i] = 입력값
                
            }
            
            for (int j = 0; j <= numbers.length - 1; j = j + 1) {
                
                sum = sum + numbers[j]; // sum 함수를 통해서 배열의 값들을 더해줌. numbers[입력해 준 성적들]
                avg = sum / numbers.length; // sum을 배열의 입력 값만큼 나눈다. y를 넣어주어도 됨. 입력값이 배열값이기 때문에.
                
            }
            
            System.out.println("합계는 : " + sum);
            System.out.print("평균은 : " + avg);
            
        }
    }
}
