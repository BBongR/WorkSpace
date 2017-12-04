package 이원준;

import java.util.Scanner;

public class ex3 {
    public static void getPrint(int i, int j) {
        System.out.println(i + " * " + j + " = " + i * j);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.print("시작단: ");
            int start = sc.nextInt();

            if (start == 0) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.print("종료단: ");
            int end = sc.nextInt();

            if (end == 0) {
                System.out.println("종료합니다.");
                break;
            }

            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
            }

            for (int i = start; i <= end; i++) {
                for (int j = 1; j <= 9; j++) {
                    getPrint(i, j);
                }
                System.out.println();
            }
        }
    }
}
