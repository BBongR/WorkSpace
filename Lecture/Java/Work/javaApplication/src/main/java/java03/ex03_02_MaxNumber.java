package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber {
    public static void main(String[] args) {
        // 정수 변수 3개 만들기
        int x, y, z;
        
        // 키보드와 프로그램 연결
        Scanner keyboard = new Scanner(System.in);
        
        // 첫번째 키보드에서 입력 받은 값을 x에 넣는다.
        System.out.print("x의 값 입력: ");
        x = keyboard.nextInt();
        
        // 두번째 키보드에서 입력 받은 값을 y에 넣는다.
        System.out.print("y의 값 입력: ");
        y = keyboard.nextInt();
        
        // 세번째 키보드에서 입력 받은 값을 z에 넣는다.
        System.out.print("z의 값 입력: ");
        z = keyboard.nextInt();
        
        // 1번 중첩 이용
        /*if (x > y) {
            if (x > z) {
                System.out.println(x);
            }
        } else {
            if ( z > y ) {
                System.out.println(z);
            } else {
                System.out.println(y);
            }
        }*/
        
        // 2번 연속 이용
        if( x > y && x > z ){
            System.out.println(x);
        } else if( y > z ) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
        
        keyboard.close();
        
    }
}
