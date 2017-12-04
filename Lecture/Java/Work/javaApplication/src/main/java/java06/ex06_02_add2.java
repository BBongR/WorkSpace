package java06;

public class ex06_02_add2 {
    
    public static void main(String[] args) {
        
        int x = 3, y = 5;
        int result;
        result = add(x, y);
        System.out.print(result);
    }
    
    static int add(int x, int y) {
        
        int result = x + y;
        return result;
    }
    
}
