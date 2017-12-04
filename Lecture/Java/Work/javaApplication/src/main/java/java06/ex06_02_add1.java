package java06;

import java.util.Scanner;

public class ex06_02_add1 {
    
    public static void main(String[] args) {
        int result;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("x입력: ");
        int x = sc.nextInt();
        System.out.print("y입력: ");
        int y = sc.nextInt();
        result = add(x, y);
        System.out.print("result = " + result);
    }
    
    public static int add(int x, int y) {
        
        int sum;
        sum = x + y;
        return sum;
    }
    
}