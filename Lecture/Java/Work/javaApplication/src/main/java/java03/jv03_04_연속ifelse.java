package java03;

import java.util.Scanner;

public class jv03_04_연속ifelse {
    public static void main(String[] args) {
        
/*하나의 점수를 입력 받고, 입력 받은 점수에 해당하는 학점을 출력하는
  프로그램을 작성하시오*/
       
        //키보드 입력 받기
        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수를 입력하시오.");
        int score = keyboard.nextInt();
        
        //키보드 입력값 출력하기
        System.out.println("입력한 점수: " + score);
        
        if( score >= 90 ) {
            System.out.println("A");
        } else if( score >= 80 ) {
            System.out.println("B");
        } else if( score >= 70 ) {
            System.out.println("C");
        } else if( score >= 60 ) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        keyboard.close();
        
    }
}
