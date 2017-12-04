package java06;

import java.util.Scanner;

public class ex06_03_isNumber3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        boolean result = isNumber(str);
        System.out.print(result);
        
    }
    
    static boolean isNumber(String str) {
        if (null == str || str.equals(""))
            return false;
        else
            return true;
    }
}
