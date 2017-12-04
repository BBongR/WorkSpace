package test;

import java.util.Arrays;

public class q37문자열에서가장큰수찾기 {
    public static void main(String[] args) {

        String s = "74 874 9883 73 9 73646 774";

        // 문자열 자르기 --> String배열을 얻게 됨
        String[] str = s.split(" ");

        // 문자열 배열 정수 배열로 만든다. 이 때 for문과 Integer.valusOf() 사용
        int[] iArr = new int[str.length];
        for (int i = 0; i < str.length; i = i + 1) {

            int k = Integer.valueOf(str[i]);

            iArr[i] = k;

        }

        Arrays.sort(iArr);

        System.out.println(iArr[iArr.length - 1]);
    }
}
