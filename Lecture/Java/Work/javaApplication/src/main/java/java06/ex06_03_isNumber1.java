package java06;

import java.util.Scanner;

public class ex06_03_isNumber1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean b;
        System.out.print("문자열 입력: ");
        String s = sc.nextLine();
        b = IsNumber(s);
        System.out.println(b);
        
    }
    
    public static boolean IsNumber(String s) {
        
        if (s.equals("")) {
            return false;
        } else {
            return true;
        }
        
    }
}