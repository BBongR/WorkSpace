package java07;

import java.util.Scanner;

public class ex07_01_동적배열1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        
        for (int i = 0; i <= arr.length - 1; i = i + 1) {
            System.out.println("arr[" + i + "]");
        }
        
    }
    
}
