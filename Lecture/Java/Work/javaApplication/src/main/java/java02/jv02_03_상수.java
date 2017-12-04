package java02;

public class jv02_03_상수 {
    
    public static void main(String[] args) {        
       
        // 상수의 선언 : 상수는 대문자로만..
        final double PI = 3.141592;
        System.out.println(  PI  );
        
        // 상수는 선언 후 변경은 불가하다. 아래 코드는 안됨.
        //PI = 4.141592; 
        System.out.println(  PI  );
        
    }    
}
