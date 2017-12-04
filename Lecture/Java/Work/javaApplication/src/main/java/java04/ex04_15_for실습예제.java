package java04;

import java.util.Scanner;

public class ex04_15_for실습예제 {
    public static void main(String[] args) {
        // 사용자로부터 입력 받은 숫자에 해당하는 구구단을 역순으로 출력하는
        // 프로그램을 만드시오
        Scanner sc = new Scanner(System.in);
        
        System.out.print("몇단: ");
        int dan = sc.nextInt();
        
        for (int i = 9; 
                        i >= 1; 
                                i = i - 1) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }
        
    }
}
