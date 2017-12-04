package java04;

import java.util.Scanner;

public class two4_04_합계구하기swap {
       
            public static void main(String[] args){ //메인 메서드
                Scanner sc = new Scanner(System.in);  //키보드와 프로그램 연결
                int A,B;
                int sum = 0;
                int tmp = 0;
                
                System.out.print("시작값을 입력하세요 : "  );
                A = sc.nextInt(); //정수 입력받고 A에 저장
                
                System.out.print("종료값을 입력하세요 : "  );
                B = sc.nextInt(); //정수 입력 받고 B에 저장
                         
                B = tmp; //종료값을 temp에 넣는다 
                A = B; //시작값을 종료값에
                tmp = A;//temp  시작값에
                
                if (A>B) /*시작값이 종료값보다 큰 경우
                          for 문에서 n부터 n까지 더하려면 최대 기준점 필요. */
                {
                    for (int i=tmp; i<=A; i=i+1){
                    sum+=i;
                    }                     
                }
                
                else 
               
                    System.out.println(tmp+" 부터 " +A+ " 까지의 합: " +sum );
            }
            
            
                   


    
    
}
