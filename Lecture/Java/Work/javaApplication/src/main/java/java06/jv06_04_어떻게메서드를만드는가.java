package java06;

public class jv06_04_어떻게메서드를만드는가 {
    public static void main(String[] args) {
        int i;
        
        int sum2 = 0;
        int sum3 = 0;
        
        int sum = getSum(1, 10);
        for (i = 1; i <= 100; i = i + 1) {
            sum2 += i;
        }
        for (i = 100; i <= sum2; i = i + 1) {
            sum3 += i;
        }
        
        System.out.println("" + sum);
        System.out.println("" + sum2);
        System.out.print("" + sum3);
        
    }
    
    public static int getSum(int start, int end) {
        int i;
        int sum = 0;
        for (i = start; i <= end; i = i + 1) {
            sum += i;
            
        }
        return sum;
    }
}
