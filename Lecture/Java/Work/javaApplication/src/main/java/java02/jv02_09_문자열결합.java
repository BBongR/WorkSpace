package java02;

public class jv02_09_문자열결합 {

    public static void  main( String [] args ) {

        //  숫자 + 숫자 ==> 숫자
        // int 타입으로 i, j 변수명 선언
        int i = 10;
        int j = 20;

        // int 타입의 sum 변수 만들기
        int sum = 0;

        //
        sum =  i + j ; // sum == 30

        // sum 값 출력하기
        System.out.println( sum );


        // System.out.format을 이용해서 아래의 결과를 출력하시오
        // 더하기 : 10 + 20 = 30
        System.out.format("더하기 : %d + %d = %d ", i, j, sum);


        // 문자열 선언
        String s1 = "Hello" ;
        String s2 = ", World!!!";
        System.out.println(s1 + s2);        

        String s3 = s1 + s2;

        // s3 출력하기
        System.out.println( s3 );


        // println과 + 을 이용해서 아래의 결과를 출력하시오
        // 더하기 : 10 + 20 = 30
        String s4 = "더하기 : " + i + " + " + j + " = " + sum + "";
        System.out.println( s4 );

    }
}
