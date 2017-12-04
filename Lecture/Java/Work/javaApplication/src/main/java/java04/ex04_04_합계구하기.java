package java04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    public static void main(String[] args){
        
        /*실행결과예시
        INPUT
        시작값을 입력하세요 : 1
        종료값을 입력하세요 : 4
        OUTPUT
        1qnxj 4까지의 합계는 10입니다*/
        
        Scanner keyboard = new Scanner(System.in);
           
        int sum = 0;
        
        System.out.print("시작값을 입력: ");
        int start = keyboard.nextInt();
        
        System.out.print("종료값을 입력: ");
        int end = keyboard.nextInt();
        
        for(int i=start; i<=end; i=i+1) {
          sum = sum + i;
        }
        
        System.out.println(start + "부터 " + end + "까지의 " + "합계는: " + sum);
        
    }
}