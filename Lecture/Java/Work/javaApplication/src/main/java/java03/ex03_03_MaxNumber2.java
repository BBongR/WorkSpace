package java03;

import java.util.Scanner;

public class ex03_03_MaxNumber2 {
    public static void main(String[] args){
        int x,y,z,max;       // 최대값 지정해줄 max 변수 선언
        
        Scanner sc = new Scanner(System.in); //키보드와 프로그램 연결
        
        x = sc.nextInt(); //첫번재 키보드 입력 받은 값 x
        y = sc.nextInt(); //두번째 키보드 입력 받은 값 y
        z = sc.nextInt();
        
        if (x >= y && x >=z){ //x가 y보다 크거나 같고 x가 z보다 크거나 같을때
            max = x; //그럴경우 최대값은 x다
        }else if( y >=z ){ //y >= z &&  <--위에서 선언을 해주었기 때문에 ㄴㄴ
            max = y;
        }else {
            max = z;
           
        }
        System.out.print("입력 받은 수 중 가장 큰 수는 " +max+ "입니다.");
            
        
        
    }
}
