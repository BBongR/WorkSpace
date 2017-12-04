package java04;

import java.util.Scanner;

public class ex04_03_for실습예제 {
    public static void main(String[] args) {
        int A;
        
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        
        for (int i = 1; i <= 9; i = i + 1) {
            
            System.out.print(A +" * " + i + "=" + (A * i));
        }
       
        
    }
    
}
