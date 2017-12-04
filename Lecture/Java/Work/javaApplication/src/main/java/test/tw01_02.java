package test;

import java.util.*;

public class tw01_02 {
 // 메인 메서드 만들기
    public static void main(String[] args) {
        
        // 키보드와 프로그램 연결
        Scanner keyboard = new Scanner(System.in);

        // Scanner를 이용해서 정수를 입력 받고 출력하시오
        System.out.print("정수를 입력: ");
        int i = keyboard.nextInt();
        System.out.println(i);
        
        // Scanner를 이용해서 문자열을 입력 받고 출력하시오
        System.out.print("문자열 입력: ");
        String s = keyboard.next();
        System.out.println(s);
        
        keyboard.close();
    }
}
