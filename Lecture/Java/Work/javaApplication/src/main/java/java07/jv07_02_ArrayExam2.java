package java07;

import java.util.Arrays;

public class jv07_02_ArrayExam2 {
    
    public static void main(String[] args) {
        
        // 배열의 선언
        
        int size = 6;
        int[] numbers = new int[size];
        
        // 배열에 for문을 이용하여 값을 대입하시오
        for (int i = 0; i < numbers.length; i = i + 1) {
            numbers[i] = (i + 1 * 1) * 10;
        }
        
        // for문을 사용하여 배열의 값 출력
        for (int j = 0; j < numbers.length; j = j + 1) {
            System.out.println("numbers[" + j + "] : " + numbers[j]);
        }
        // System.out.println( Arrays.toString(numbers)); 배열 값 출력해주는 기능
        Arrays.toString(numbers);
        
    }
    
}
