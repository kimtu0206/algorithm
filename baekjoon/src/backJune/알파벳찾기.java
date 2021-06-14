package backJune;

import java.util.Scanner;

public class 알파벳찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String temp = sc.next();

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(temp.indexOf(i) + " ");
			// 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며 만약 찾지 못했을 경우 "-1"을 반환합니다.
		}
	}
}
