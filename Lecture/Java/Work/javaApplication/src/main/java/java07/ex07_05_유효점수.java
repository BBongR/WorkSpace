package java07;

import java.util.Arrays;
import java.util.Scanner;

public class ex07_05_유효점수 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("심사위원 수 입력: ");
        int s = sc.nextInt();
        int[] simsa = new int[s];
        
        for (int i = 0; i < simsa.length; i = i + 1) {
            System.out.print("[" + (i + 1) + "]번째 점수 입력: ");
            simsa[i] = sc.nextInt();
        }
        
        Arrays.sort(simsa);
        for (int i = 0; i < simsa.length; i = i + 1) {
            System.out.print(simsa[i]);
            if (i == simsa.length - 1) {
            } else
                System.out.print(", ");
            
        }
        
    }
    
}
