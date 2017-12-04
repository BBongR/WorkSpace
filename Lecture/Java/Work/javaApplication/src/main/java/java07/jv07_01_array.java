package java07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class jv07_01_array {
    
    public static void main(String[] args) {
        
        // 변수 5개 선언
        int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
        
        // 배열을 이용한 변수 5개 선언
        int[] score = new int[5];
        int[] arr = new int[5];
        
        score[0] = 0; // score배열 첫번째(0번째)에 0을 넣는다
        score[1] = 1; // score배열 두번째(1번째)에 0을 넣는다
        score[2] = 2; // score배열 세번째(2번째)에 0을 넣는다
        score[3] = 3; // score배열 네번째(3번째)에 0을 넣는다
        score[4] = 4; // score배열 다섯번째(4번째)에 0을 넣는다
        
        // 출력 score1 값을 출력하시오
        System.out.println("score1: " + score1);
        
        // 출력 score 첫번째(0번째) 값을 출력하시오
        System.out.println("score0: " + score[0]);
        System.arraycopy(score, 0, arr, 0, score.length);
        for(int i=0; i<arr.length; i=i+1)
        System.out.println(arr[i]);
    }
    
}
