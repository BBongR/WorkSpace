package java02;

public class jv02_08_문자와문자열 {
    
    public static void main(String[] args) {
        
        // 문자 변수의 선언과 초기화
        char ch1 = '가';
        System.out.println( "ch1: " + ch1 );
		
        char ch2 = '\uac00'; // \uac00 은 '가'를 의미함.
        System.out.println( "ch2: " + ch2 );

        System.out.println( "ch1: " + ch1 + ", " + "ch2: " + ch2 );
        
        // 문자열 변수의 선언과 초기화
        String s  = "Hello, world!!!";
        System.out.println( s  );
    }
}
