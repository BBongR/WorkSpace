package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_03_반평균구하기6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("학생 수 입력: ");
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum=0;
        double average=0;
        
        for(int i=0; i<arr.length; i=i+1){
            System.out.print(i+1+"번째 입력: ");
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i = i + 1) {
            sum = sum + arr[i];
            average = sum / arr.length;
        }
        
        /*for(int j=0; j<arr.length; j=j+1){
            System.out.print(arr[j]);
            if(j<arr.length-1)
                System.out.print(", ");
        }*/
        
        System.out.println(Arrays.toString(arr));
        System.out.printf("합계: %d 평균: %f", sum, average);
    }
}
