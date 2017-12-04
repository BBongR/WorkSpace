package java06;

public class jv06_01_왜메서드를쓰는가2 {
    public static int getSum(int start, int end) {
        
        int sum = 0;
        for (int i = start; i <= end; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        
        int sum = getSum(1, 10);
        int sum1 = getSum(1, 100);
        int sum2 = getSum(100, sum1);
        
        System.out.println("" + sum);
        System.out.println("" + sum1);
        System.out.println("" + sum2);
        
    }
}