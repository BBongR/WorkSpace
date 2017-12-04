package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String x = sc.next();
    }
    
    public static boolean isNumber(String str) {
        boolean result=true;
        
        if (str==null || str==("")){
        result = false;
    }
        return result;
    
    }
        
    
    
}
