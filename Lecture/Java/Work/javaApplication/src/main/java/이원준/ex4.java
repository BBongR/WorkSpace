package 이원준;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("firstNum: ");
        int firstNum = sc.nextInt();
        System.out.print("secondNum: ");
        int secondNum = sc.nextInt();

        Oper op = new Oper();
        op.setFirstNum(firstNum);
        op.setSecondNum(secondNum);

        System.out.println(op.add());
        System.out.println(op.minus());
        System.out.println(op.mul());
        System.out.println(op.div());
    }

}
