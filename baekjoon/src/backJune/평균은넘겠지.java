package backJune;

import java.util.Scanner;

public class 평균은넘겠지 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr; //배열 변수 선언
		
		int testcase = scan.nextInt(); //testcase 정수값 선언
		
		for(int i =0; i<testcase; i++) {
			int N = scan.nextInt(); //학생수 정수값을 입력받는다
			arr = new int[N]; //배열에 학생수를 저장
			
			double sum = 0; //성적 누적 합 변수
			
			//성적 입력부분
			for(int j=0; j<N; j++) {
				int val = scan.nextInt(); //성적입력
				arr[j] = val; //배열에 성적을 저장
				sum+=val; //성적 누적 합
				
			}
			
			double mean = (sum / N);
			double count = 0; //평균 넘는 학생수 변수
			
			//평균넘는학생수 비율 찾기
			for(int j=0; j<N; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.println(String.format("%.3f", (count/N)*100)+"%");
		}
		
		scan.close();
	}
	
}
