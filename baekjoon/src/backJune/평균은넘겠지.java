package backJune;

import java.util.Scanner;

public class ������Ѱ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr; //�迭 ���� ����
		
		int testcase = scan.nextInt(); //testcase ������ ����
		
		for(int i =0; i<testcase; i++) {
			int N = scan.nextInt(); //�л��� �������� �Է¹޴´�
			arr = new int[N]; //�迭�� �л����� ����
			
			double sum = 0; //���� ���� �� ����
			
			//���� �Էºκ�
			for(int j=0; j<N; j++) {
				int val = scan.nextInt(); //�����Է�
				arr[j] = val; //�迭�� ������ ����
				sum+=val; //���� ���� ��
				
			}
			
			double mean = (sum / N);
			double count = 0; //��� �Ѵ� �л��� ����
			
			//��ճѴ��л��� ���� ã��
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
