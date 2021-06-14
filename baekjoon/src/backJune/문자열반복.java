package backJune;

import java.util.Scanner;

public class 문자열반복 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//테스트 케이스 입력 값 저장
		int T = scan.nextInt();
		
		//테스트 케이스 개수 만큼 반복
		for (int i = 0; i < T; i++) {
			//반복 출력 횟수 저장
			int R = scan.nextInt();
			//반복 출력할 문자열 저장
			String S = scan.next();

			// 문자열 길이만큼 반복, 한글자씩 세분화 작업
			for (int j = 0; j < S.length(); j++) {
				//반복 출력 횟수 만큼 반복
				for (int k = 0; k < R; k++) { 
					System.out.print(S.charAt(j));
				}
			}
			//줄바꿈
			System.out.println();
		}
	}
}
