package backJune;

import java.util.Scanner;

public class �Ѽ� {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(hansu(scan.nextInt()));
		scan.close();
	}
	
	
	
	
	public static int hansu(int num) {
		int cnt = 0; // �Ѽ� ī����

		if (num < 100) { 
			return num;
		}

		else {
			cnt = 99;
			if (num == 1000) { // ����ó�� �ʼ� (1000���� ū ���� �Է� ���� �ʱ� ������)
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // ���� �ڸ���
				int ten = (i / 10) % 10; // ���� �ڸ���
				int one = i % 10;

				if ((hun - ten) == (ten - one)) { //�� �ڸ����� ������ �̷��
					cnt++; //���� chick
				}
			}
		}
		return cnt;
	}
}
