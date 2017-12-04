package java02;

public class jv02_21_형변환 {
    public static void main(String[] args) {

        int i = 43;
        
        //변수 i --> double 변환
        double d = (double) i;
        System.out.println(d);
        
        //변수 i --> char 변환
        char c = (char) i;
        System.out.println(c);
        
        // 변수 i --> boolean 변환
        boolean b = ( i != 0);
        System.out.println(b);
        
        //변수 i --> String 변환
        //String s = (String) i;
        String s = Integer.toString( i );
        System.out.println(s);
        
    }
}
