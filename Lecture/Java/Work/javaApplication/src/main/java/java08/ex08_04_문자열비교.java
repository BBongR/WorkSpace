package java08;

import java.util.Scanner;

public class ex08_04_문자열비교 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please input first string: ");
        String x = input.next();
        System.out.print("Please input second string: ");
        String y = input.next();
        
        // equal 을 이용하여 비교
        if (x.equals(y)) {
            System.out.println("x.equals(y) : same");
        } else {
            System.out.println("x.equals(y) : not same");
        }
        
        // == 을 이용하여 비교
        if (x == y) {
            System.out.println("x == y : same");
        } else {
            System.out.println("x == y : not same");
        }
    }
    
}
