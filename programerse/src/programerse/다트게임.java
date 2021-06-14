package programerse;

public class ��Ʈ���� {

	class Solution {
		public int solution(String dartResult) {
			int answer = 0;

			String temp = ""; // ���ڿ� �� 1�� ���� ���� ����
			int arr[] = new int[3]; // �� �ܰ躰 ȹ�� ������ ������ �迭
			int idx = 0; // �迭�� �����ϱ� ���� idx

			// 1. dartResult ���ڿ� Ž��
			for (int i = 0; i < dartResult.length(); i++) {
				// 1-1 ���ڿ��� �� ���ڿ� ���� ���� ó��
				switch (dartResult.charAt(i)) {
				// 1-2 * �� ���� �ڽŰ� ������ ���� *2, idx�� S,D,T ó���� �����ϱ� ������ idx-1, idx-2 �� *2
				case '*':
					arr[idx - 1] *= 2;
					if (idx > 1)
						arr[idx - 2] *= 2;
					break;
				// 1-3 #�� �ڽ��� ������ ������ �����.
				case '#':
					arr[idx - 1] *= -1;
					break;

				// 1-4 S�� 1����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� temp�� �ʱ�ȭ
				case 'S':
					arr[idx] = (int) Math.pow(Integer.parseInt(temp), 1);
					idx++;
					temp = "";
					break;

				// 1-5 D�� 2����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� temp�� �ʱ�ȭ
				case 'D':
					arr[idx] = (int) Math.pow(Integer.parseInt(temp), 2);
					idx++;
					temp = "";
					break;

				// 1-6 T�� 3����, ���� ������ ���� idx�� ������Ű�� ������ �����ϴ� temp�� �ʱ�ȭ
				case 'T':
					arr[idx] = (int) Math.pow(Integer.parseInt(temp), 3);
					idx++;
					temp = "";
					break;

				// 1-7 �� ���� �������� temp ������ ���� ���ڰ� ���� ���� �ֱ� ������ valueOf�� ���
				default:
					temp += String.valueOf(dartResult.charAt(i));
					break;

				}
			}
			// ���� ������ ���� ���� �� Ƚ���� ������ ��� ���ϸ� ����
			for (int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
			return answer;
		}
	}
}
