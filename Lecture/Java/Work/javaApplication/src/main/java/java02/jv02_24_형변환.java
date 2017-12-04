package java02;

public class jv02_24_형변환 {
    public static void main(String[] args) {
        
        int result1;
        int result2;
        int result3;
        int result4;
        int result5;
        
        result1 = 1 + '2';
        System.out.println(result1);
        
        result2 = '2' + ( (true) ? 1 : 0 ) ;
        System.out.println(result2);
        
        result3 = Integer.parseInt("15") - 5;
        System.out.println(result3);
        
        result4 = Integer.parseInt("1") + '2';
        System.out.println(result4);
        
        result5 = ( (false) ? 1 : 0 ) + ( (true) ? 1 : 0);
        System.out.println(result5);
        
    }
}
