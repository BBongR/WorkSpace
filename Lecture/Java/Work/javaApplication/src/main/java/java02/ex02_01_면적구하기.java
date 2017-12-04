package java02;

import java.util.Scanner;


public class ex02_01_면적구하기 {

        public static void main(String [] args) {

            int w = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("가로:");
            w = input.nextInt();

            int h = 0;
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("세로:");
            h = input.nextInt();

            int area = w*h;
            System.out.println("넓이 : " + area);

            int perimeter = 2*(w+h);
            System.out.println("둘레 : " + perimeter);


        }
    }
