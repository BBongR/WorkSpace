package java04;

import java.util.Scanner;

public class ex11_구구단 {
    public static void main(String[] args) {
        // for문에서 입력받은 값을 계산해야 하므로 for문 앞에 사용해야함.
        // 입력 받을 변수 선언
        Scanner sc = new Scanner(System.in);
        int r = 0;
        
        // 키보드와 프로그램 연결
        
        System.out.print("시작단을 입력하세요 : "); 
        int a = sc.nextInt(); // 정수 입력 받아 변수 공간에 저장.
        
        System.out.print("종료단 입력하세요 : "); 
        int b = sc.nextInt(); // 정수 입력 받아 변수 공간에 저장.
        
        for (int i = a; i <= b; i = i + 1) {
            
           
            
            for (int j = 1; j <= 9; j = j + 1) {
                
                r = i * j;
                System.out.println(i + " * " + j + " = " + r);
            }
            
      
            System.out.println();
            {
                
            }
            
        }
    }
}
