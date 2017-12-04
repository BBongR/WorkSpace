package java07;

import java.util.Scanner;

public class ex07_03_배열로최대최소구하기1 {
    
    public static void main(String[] args) {
        
     // 10개의 정수를 입력 받아 배열에 저장하고 이 배열의 최대, 최소값을 구하시오
        
        /*실행결과
        INPUT: 23, 96, 35, 42, 81, 19, 8, 77, 50, 64
        배열 정렬 전: 23, 96, 35, 42, 81, 19, 8, 77, 50, 64
        배열 정렬 후: 8, 19, 23, 35, 42, 50, 64, 77, 81, 96
        최소값 : 8
        최대값 : 96*/
        int[] arr = new int[10];
        int max = 0, min = 0;
        int temp;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(i + 1 + "번째" + "점수 입력: ");
            arr[i] = sc.nextInt();
        }
        
        /*for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            
            if (i == arr.length - 1) {
                
            } else {
                System.out.print(", ");
            }
        }*/
        
        System.out.print("정렬 전: ");
        
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            
            if (i == arr.length - 1) {
                
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        for (int i = 0; i < arr.length; i = i + 1) {
            for (int j = i + 1; j < arr.length; j = j + 1) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("정렬 후: ");
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(arr[i]);
            
            if (i == arr.length - 1) {
                
            } else {
                System.out.print(", ");
            }
        }
        
    }
    
}
