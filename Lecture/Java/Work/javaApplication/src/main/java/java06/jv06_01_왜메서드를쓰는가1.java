package java06;

public class jv06_01_왜메서드를쓰는가1 {
    public static void main(String[] args) {
        
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 1; i <= 10; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 합: " + sum);
        
        for (int i = 1; i <= 100; i = i + 1) {
            sum1 = sum1 + i;
        }
        System.out.println("1부터 100까지의 합: " + sum1);
        
        for (int i = 100; i <= sum1; i = i + 1) {
            sum2 = sum2 + i;
        }
        System.out.print("100부터 sum2까지의 합: " + sum2);
        
    }
}