package test;

public class Q36String객체 {
    public static void main(String[] args) {

        String prov = "abc defg ijklm nop qrs wx yz";

        // 문자열의 prov의 길이를 구하는 코드를 작성하시오.
        System.out.println(prov.length());
        System.out.println("---------------------------------------");

        // prov에서 defg를 추출하는 코드를 작성하시오.
        String[] str = prov.split(" ");

        for (int i = 0; i < str.length; i = i + 1) {
            System.out.println(str[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println(str[1]);

        // 문자열 prov에서 ijk를 *#$%^로 바꾸는 코드를 작성하시오.
        String s = prov.replace("ijk", "*#$%^");
        System.out.println(s);
    }
}
