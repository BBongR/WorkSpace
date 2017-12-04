package java03;

import java.util.Scanner;

public class jv03_03_연속ifelse {
    
    public static void main(String[] args){
        
    int score;
    char grade = 0;
    
     
    System.out.print ("Grade: " ); //키보드 입력 받기
    
    Scanner sc = new Scanner(System.in); //키보드 입력 받기
    
    score = sc.nextInt(); //입력한 값을 else if 에 맞춰서 출력
    
    if (score >= 90 && score <= 100){/* && -> and 연산, x와 y모두 참이면 참, 
                                         그렇지 않으면 거짓,
                                         키보드 출력하기 */
        grade = 'A';
        
    }else if(score >= 80 && score <=89){
        grade = 'B';
    }else if(score >= 70 && score <=79){
        grade = 'C';
    }else if(score >= 60 && score <=69){
        grade = 'D';
    }else if(score < 60){
        grade = 'F';
    }
    
   
    System.out.println("학점 : " + grade); // 출력
   
   
    
   
        
}
}
