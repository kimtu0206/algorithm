package backJune;

import java.util.Scanner;

public class 한수 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(hansu(scan.nextInt()));
		scan.close();
	}
	
	
	
	
	public static int hansu(int num) {
		int cnt = 0; // 한수 카운팅

		if (num < 100) { 
			return num;
		}

		else {
			cnt = 99;
			if (num == 1000) { // 예외처리 필수 (1000보다 큰 수는 입력 받지 않기 때문에)
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;

				if ((hun - ten) == (ten - one)) { //각 자릿수가 수열을 이루면
					cnt++; //갯수 chick
				}
			}
		}
		return cnt;
	}
}
