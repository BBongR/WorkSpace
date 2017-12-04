package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    
    public static void main(String[] args) {
        
   /*  배열을 이용해서 반의 평균을 구하시오.
    • 학생수를 입력 받고 입력 받은 학생 수 만큼의 배열을 만든다
    • 학생마다의 성적을 입력 받아 배열에 저장한다.
    • 배열의 합계를 구하고 출력한다. 합계를 구할 때 for문을 사용
    • 평균을 구하고 출력한다.*/
        
      /* 실행결과
        학생수 입력: 3
        점수 입력: 35
        점수 입력: 45
        점수 입력: 55
        합계: 135
        평균: 45.0*/

        int sum = 0;
        double average = 0;
        Scanner sc = new Scanner(System.in); // 키보드와 프로그램 연결
        System.out.print("학생수 입력: "); // 사용자에게 질문
        int su = sc.nextInt(); // 사용자로부터 학생수 입력 받고
        int[] str = new int[su]; // 입력받은 학생수로 배열 만들고
        
        for (int i = 0; i < str.length; i = i + 1) {
            System.out.print("점수 입력: ");
            str[i] = sc.nextInt();
        }
        
        for (int i = 0; i < str.length; i = i + 1) {
            sum = sum + str[i];
            average = (double) sum / str.length;
        }
        
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
    
}
