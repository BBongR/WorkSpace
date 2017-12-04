package java04;

import java.util.Scanner;

public class ex04_21_무한입력 {
    public static void main(String[] args){
        
      /*키보드에서 정수를 입력 받아 출력하는 프로그램을 작성하시오
        단, 입력된 정수값이 음수인 경우에만 프로그램을 종료하시오*/
        Scanner sc = new Scanner(System.in);
      
        int i=0;
        
        for( ; ; ){
            System.out.print("정수 입력: ");
            i = sc.nextInt();
            System.out.println("입력한 값은"+i+"입니다");
            if(i<0)
               break;
        }
    }
}
