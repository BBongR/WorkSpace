package 이원준;

import java.util.Scanner;

public class ex1 {
    public static void getSum(int i, int end, int sum) {
        System.out.print(i);

        if (i < end)
            System.out.print("+");
        else
            System.out.print("=" + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("시작값을 입력하세요. ");
        int start = sc.nextInt();
        System.out.print("종료값을 입력하세요. ");
        int end = sc.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;

            getSum(i, end, sum);
        }

        sc.close();
    }

}
