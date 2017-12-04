package java06;

import java.util.Scanner;

public class ex06_03_isNumber2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        boolean b = isNumber(str);
        System.out.print(b);
    }
    
    public static boolean isNumber(String s){
        
        boolean result = false;
        if( s == null || s.equals(""))
            result = false;
        else
            result = true;
    
        return result;
    }
    
}
