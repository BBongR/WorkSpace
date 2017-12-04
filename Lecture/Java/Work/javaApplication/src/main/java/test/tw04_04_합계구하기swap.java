package test;
import java.util.*;
public class tw04_04_합계구하기swap {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i, temp;
        
        System.out.print("시작값 입력: "); //정수를 입력 받고 "시작값" 저장
        int start = sc.nextInt();
        System.out.print("종료값 입력: "); //정수를 입력 받고 "종료값" 저장
        int end = sc.nextInt();
        
        if(start > end){                   //종료값이 시작값보다 크다면
            temp = end;                    //종료값을 temp임시 변수에 저장
            end = start;                   //시작값을 종료값에 저장
            start = temp;                  //종료값을 임시로 저장해논 temp값을
        }                                  //시작값에 저장
        
        for(i=start; i<=end; i=i+1)        //i는 시작값부터 종료값까지 i를 1씩
            sum = sum + i;                 //증가시키면서 합계를 구하시오
        
        System.out.println(sum);
    }
}
