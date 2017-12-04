package java02;

public class jv02_23_형변환 {
    public static void main(String[] args) {
        
        int i = 0;
        double d = 0.0;
        
        d = (double)( 5 / 4 );
        System.out.println("5 / 4 = " + d);                   // X
        
        d = 5.0 / 4;
        System.out.println("(double)(5 / 4) = " + d);
        
        d = (double)5 / 4;
        System.out.println("(double)5 / 4 = " + d);           // O
        
        d = (double)(5 / 4);
        System.out.println("5 / 4 = " + d);                   // X
        
        // 중요!! 연산 전 형 변환 해야 한다.
        
    }
}
