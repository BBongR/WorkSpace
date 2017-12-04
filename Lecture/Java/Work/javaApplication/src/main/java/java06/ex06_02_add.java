package java06;

import java.util.Scanner;

public class ex06_02_add {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int value = add(x, y); //value 선언 add()밑에 메소드로 넘어감.
        
        System.out.print(value);
    }
    
    static int add(int a, int b) {
        
        int result = a + b; //위에서 받아온 값 계산
         
        return result; //복귀
        
    }
}
