package test;

import java.util.*;

public class tw01_03 {
    // 메인 메서드 만들기
    public static void main(String[] args) {
        
        // salary, deposit 정수 변수 선언
        int salary, deposit;
        
        //키보드와 프로그램 연결 : Scanner 사용
        Scanner keyboard = new Scanner(System.in);
        System.out.print("월급을 입력하시오: ");
        
        //Scanner를 이용해서 정수를 입력받고 salary 변수에 저장하시오
        salary = keyboard.nextInt();
        
        //10년치 월급의 총합을 구하고 그 값을 deposit에 저장하시오
        deposit = salary * 120;
        
        //10년 동안의 저축액: ??? 원 형태로 출력하시오
        //반드시 10년 동안의 저축액: 이라는 텍스트가 출력되게 하시오
        System.out.println("10년 동안의 저축액: " + deposit);
        
        keyboard.close();
        
    }
}
