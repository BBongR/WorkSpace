package java07;

public class jv07_05_foreach {
    
    public static void main(String[] args) {
        
        // 배열의 선언과 초기화
        int[] numbers = { 10, 20, 30 };
        
        // for문을 사용하여 배력의 값 출력
        for (int j = 0; j < numbers.length; j = j + 1) {
            System.out.println(numbers[j]);
        }
        
        System.out.println();
        
        // foreach를 이용하여 배열에 값을 출력
        for (int val : numbers) {
            System.out.println(val);
        }
    }
    
}
