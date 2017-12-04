package java04;

import java.util.Scanner;

public class ex04_12_구구단3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int i, j;
        
        for (;;) {
            System.out.print("시작단을 입력하세요 : ");
            int a = sc.nextInt();
            
            System.out.print("종료단 입력하세요 : ");
            int b = sc.nextInt();
            
            if (a > b) {
                
                for ( i = a; i <= b; i = i + 1) {
                    
                    for ( j = 1; j <= 9; j = j + 1) {
                        
                        r = i * j;
                        
                        System.out.println(i + " * " + j + " = " + r);
                    }
                 
                   
                }
                
                {
                    
                }
            }
            
            System.out.println();
            {
            }
        }
        
    }
}
