package backJune;

import java.util.Scanner;

public class ���ڿ��ݺ� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�׽�Ʈ ���̽� �Է� �� ����
		int T = scan.nextInt();
		
		//�׽�Ʈ ���̽� ���� ��ŭ �ݺ�
		for (int i = 0; i < T; i++) {
			//�ݺ� ��� Ƚ�� ����
			int R = scan.nextInt();
			//�ݺ� ����� ���ڿ� ����
			String S = scan.next();

			// ���ڿ� ���̸�ŭ �ݺ�, �ѱ��ھ� ����ȭ �۾�
			for (int j = 0; j < S.length(); j++) {
				//�ݺ� ��� Ƚ�� ��ŭ �ݺ�
				for (int k = 0; k < R; k++) { 
					System.out.print(S.charAt(j));
				}
			}
			//�ٹٲ�
			System.out.println();
		}
	}
}
