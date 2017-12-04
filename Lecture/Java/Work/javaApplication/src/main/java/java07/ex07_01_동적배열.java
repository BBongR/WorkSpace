package java07;

import java.util.Scanner;

public class ex07_01_동적배열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("만들고자 하는 배열 크기를 입력하시오 : ");
        int A = sc.nextInt();
        
        int[] numbers = new int[A];
        
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j;
        }
        
        for (int j = 0; j < numbers.length; j++) {
            System.out.print("[" + numbers[j] +"]");
        }
        
    }
    
}
