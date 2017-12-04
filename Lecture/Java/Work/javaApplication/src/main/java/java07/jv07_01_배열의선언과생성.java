package java07;

public class jv07_01_배열의선언과생성 {
    
    public static void main(String[] args) {
        
        int size = 6;
        int[] numbers = new int[size]; // 선언과 동시에 생성
        
        // 배열에 값을 대입
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        
        // 배열의 출력
        for(int j=0; j<numbers.length; j=j+1)
            System.out.println(numbers[j]);
            
    }
    
}
