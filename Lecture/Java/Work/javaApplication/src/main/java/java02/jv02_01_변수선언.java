package java02;

public class jv02_01_변수선언 {
    
    public static void main(String[] args) {
        // 변수 타입
        // 1. 기본형: 실제값이 저장: boolean, char, int, double
        // 2. 참조형: 주소값이 저장: 기본형 빼고 모두.
        
        // 변수 선언 
        // 변수타입 변수명 = 설정값;
        
        // boolean 변수 선언 
        boolean kang = true ; // false(==0), true(==1);
        
        // char 변수 선언
        char dong = 'a';
        
        // int 변수 선언
        int won = 0;
        
        // double 변수 선언
        double song = 10.01;

        // 변수값 출력
        System.out.println( kang );
        System.out.println( dong );
        System.out.println( won  );
        System.out.println( song );  
        
        
        // 변수값 변경은 선언후에만 가능
        kang = false;
        dong = 'b' ;
        won  = 100 ;
        song = -145.23 ;

        // 변수값 변경 후 출력
        System.out.println( kang );
        System.out.println( dong );
        System.out.println( won  );
        System.out.println( song );
    }

}
