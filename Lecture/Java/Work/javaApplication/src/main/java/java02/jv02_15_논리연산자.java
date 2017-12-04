package java02;

public class jv02_15_논리연산자 {

    public static void main(String[] args) {

        //  변수 선언 & 초기화
        boolean b1 = false, b2 = true ;        
        boolean result = false ;
        
        // AND 연산
        result = b1 && b2;  
        System.out.println( b1 && b2 );  // false
        System.out.println( "AND 연산 : " + result);
        
        // OR 연산
        result = b1 || b2; 
        System.out.println( b1 || b2 );  // true
        System.out.println( "OR 연산 : " + result);
        
        // NOT 연산 
        result = !b1 ; 
        System.out.println( !b1  );  // true
        System.out.println( "NOT 연산 : " + result);
    }   
}
