package java06;

public class jv06_01_왜메서드를쓰는가02 {
    
    public static int/*반환값 있는 경우 int 사용 */ getSum(int start, int end) { //int start와 int end를 선언)메소드?
        int sum = 0;
        int i;
        for ( i = start; i <= end; i = i + 1) { //처음에 for문 한번만 선언. 
            sum = sum + i; 
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
       
        int sum = getSum(1, 10);
        int sum2 = getSum(1, 100);
        int sum3 = getSum(100, sum2);
        
   
        
        System.out.println("" + sum);
        System.out.println("" + sum2);
        System.out.print("" + sum3);
        
    }
}
