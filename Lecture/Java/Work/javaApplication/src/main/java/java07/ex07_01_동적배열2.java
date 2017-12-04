package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_01_동적배열2 {
    
    public static void main(String[] args) {
        
        // 키보드 입력을 통해서 만들고자 하는 배열의 크기를
        // 입력 받고 정수 크기의 정수(int) 배열을 만드시오
        Scanner sc = new Scanner(System.in);
        
        System.out.print("배열 크기 입력: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        System.out.println(Arrays.toString(arr));
        
    }
    
}
