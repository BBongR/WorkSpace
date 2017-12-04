package java04;

public class ex04_13_for실습예제 {
    public static void main(String[] args) {
        // 구구단 2단을 출력하는 프로그램을 만드시오
        int dan = 2;
        
        for (int i = 1; i <= 9; i = i + 1)
            System.out.println(dan + " * " + i + " = " + dan * i);
        
    }
}