package java07;

public class jv07_08_Arrays메서드 {
    
    public static void main(String[] args) {
        
        int size = 6;
        int[] array = new int[size];// 배열 만들기
        // for문을 이용한 배열 초기화
        for (int i = 0; i <= array.length - 1; i = i + 1) {
            array[i] = array.length - i;
        }
        printArray(array);
        // Arrays 정렬 printArray[]호출
        java.util.Arrays.sort(array);
        printArray(array);
        // Arrays 검색printArray[]호출
        int val = java.util.Arrays.binarySearch(array, 4);
        System.out.println("4값의 위치 " + val);
        
        // Arrays 정렬 초기화printArray[]호출
        
    }
    
    // 메서드 만들기
    // 매서드 타입 : void
    // 매개변수 : 정수배열
    public static void printArray(int[] x) {
        
        for (int i = 0; i <= x.length - 1; i = i + 1) {
            System.out.println(x[i] + ".");
            
        }
        return;
        
    }
}
