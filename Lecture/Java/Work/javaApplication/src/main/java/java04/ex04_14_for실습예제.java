package java04;

public class ex04_14_for실습예제 {
    public static void main(String[] args) {
        // 구구단 2단을 출력하는 프로그램을 만드시오
        int dan = 2;
        int i = 0;
        
        for (i = 1; i <= 9; i = i + 1) {
            System.out.print(dan + " * " + i + " = " + dan * i);
            if (i == 9) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
        
    }
}