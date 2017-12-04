package java04;

import java.util.Scanner;

public class ex04_01_n1부터n2합계구하기 {
    public static void main(String[] args){
      /*1이상의 정수 n1과 n2를 입력 받는다. 그리고 n1부터 입력 받은 정수
        n2까지의 합을 계산해서 그 결과를 출력하는 프로그램을 작성하시오
        실행결과 예시
        정수를 입력하세요: 2 6
        2+3+4+5+6=20*/
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        
        System.out.print("정수를 입력: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        for(i=n1; i<=n2; i=i+1){
            sum = sum + i;
            System.out.print(i);
            if(i<n2){
                System.out.print(" + ");
            }
        }
        System.out.print(" = " + sum);
    }
}
