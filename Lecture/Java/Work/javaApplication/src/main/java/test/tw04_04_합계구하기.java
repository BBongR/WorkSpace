package test;
import java.util.*;
public class tw04_04_합계구하기 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i;
        
        System.out.print("시작값 입력: "); //정수를 입력 받고 "시작값" 저장
        int start = sc.nextInt();
        System.out.print("종료값 입력: "); //정수를 입력 받고 "종료값" 저장
        int end = sc.nextInt();
        
        if( start > end ){                 //시작값이 종료값보다 크다면
            for( i=end; i<=start; i=i+1)   //i는 종료값부터 시작값까지 i를 1씩
                sum = sum + i;             //증가시키면서 합계를 구하시오
        }else{                             //아니면
            for( i=start; i<=end; i=i+1)   //i는 시작값부터 종료값까지 i를 1씩
                sum = sum + i;             //증가시키면서 합계를 구하시오
        }
        
        System.out.println(sum);
    }
}
