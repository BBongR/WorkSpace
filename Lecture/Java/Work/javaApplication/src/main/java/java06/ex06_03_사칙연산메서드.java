package java06;

public class ex06_03_사칙연산메서드 {
    public static void main(String[] args) {
        
        int x = 0, y = 0;
        
        int add = Add(2, 4);
        int minus = Minus(2, 4);
        int mul = Mul(2, 4);
        double div = Div(2, 4);
        
        System.out.println(add);
        System.out.println(minus);
        System.out.println(mul);
        System.out.format("%f", div);
    }
    
    private static int Add(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
        
    }
    
    private static int Minus(int x, int y) {
        int sum;
        sum = x - y;
        return sum;
    }
    
    private static int Mul(int x, int y) {
        int sum;
        sum = x * y;
        return sum;
    }
    
    private static double Div(double x, double y) {
        double sum;
        sum = x / y;
        return sum;
    }
}
