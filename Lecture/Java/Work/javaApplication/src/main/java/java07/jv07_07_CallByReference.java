package java07;

public class jv07_07_CallByReference {
    
    public static void main(String[] args) {
        
        // 배열의 선언과 초기화
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 3;
        
        System.out.println("swap 전: a= " + arr[0] + ", b= " + arr[1]);
        swap(arr);
        System.out.println("swap 후: a= " + arr[0] + ", b= " + arr[1]);
    }
    
    private static void swap(int[] arr) {
        // a-->b, b-->a
        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
        System.out.println("swap 안: a= " + arr[0] + ", b= " + arr[1]);
    }
}