package java02;

public class jv02_11_산술연산자 {
    
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int result = 0;
        
        // 더하기 : 4 + 5
        result = x + y;
        System.out.println("더하기 = " + result );
           
        // 빼기 : 4 -5
        result = x - y;
        System.out.println( "빼기 = " + result );
                
        // 곱하기 : 4 * 5
        result = x * y;
        System.out.println( "곱하기 = " + result );
        
        // 나누기 : 4/5 == 0
        result =  x / y;
        System.out.println( "나누기 = " + result );
        
        // 나머지 : 4%5 == 4
        result = x % y;
        System.out.println( "나머지 = " + result );        
    }
}
