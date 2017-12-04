package java04;

import java.util.Scanner;

public class ex04_11_n1부터n2합계구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int sum = 0;
        
        System.out.print("정수를 입력하세요 :");
        a = sc.nextInt();
        b = sc.nextInt();
        
        for (int i = a; i <= b; i = i + 1) {
            sum = sum + i;
            System.out.print(i);
            if (i < b)
                System.out.print("+");
        }
        System.out.print(" = " + sum);
    }
}
