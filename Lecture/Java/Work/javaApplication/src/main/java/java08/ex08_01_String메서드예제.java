package java08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex08_01_String메서드예제 {

	public static void main(String[] args) {

		// 도전 1. 문자열 치환:
		// ÷(\u00F7) --> /, ×(\u00D7) --> * 바꾸기
		String temp = "\u00F7 \t \u00D7 ";
		System.out.println("치환 전 : " + temp); // " ÷ × "

		String s1 = temp.replace("\u00F7", "/");
		temp = s1;
		String s2 = s1.replace("\u00D7", "*");
		temp = s2;
		System.out.println("치환 후 : " + s2); // " / * "
		System.out.println("--------------------------");
		// 도전 2. 형변환. 문자열 정수로 바꾸기.
		// 문자열 "3"을 정수 3으로 바꾸시오. 구글 검색
		String temp2 = "3";
		int s3 = Integer.parseInt(temp2);
		System.out.println(s3);
		System.out.println("--------------------------");
		// 도전 3. 문자열에서 가장 큰 수를 찾으시오.

		String temp3 = "74 874 9883 73 9 73646 774";

		// a. 문자열 자르기 --> String 배열을 얻게 됨.
		String sArray[] = temp3.split(" ");

		// b. 문자열 배열을 정수 배열로 만든다.
		// 이 때 for 문과 Integer.parseInt() 사용
		int[] iArray = new int[sArray.length];
		for (int i = 0; i <= sArray.length - 1; i = i + 1) {
			// 문자열 배열에서 값을 꺼내서
			String s = sArray[i];

			// 문자열을 정수로 형변환
			int t = Integer.valueOf(s);

			// 형변환된 값을 정수 배열에 넣는다.
			iArray[i] = t;
		}

		// c. 정수배열(intArray)를 오름차순 정렬하시오
		Arrays.sort(iArray);

		// d. 정수배열에서 최대값을 찾는다.
		System.out.println(iArray[iArray.length - 1]);
	}

}
