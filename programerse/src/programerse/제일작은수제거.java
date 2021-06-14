package programerse;

public class �������������� {

	public int[] solution(int[] arr) {
		// �����ϴ� �迭�� �� �迭�� ��� -1�� ����,
		// ���̰� 1�����϶� �� �迭
		// ������ ����� ���� ����, �ƴҰ�� �ݺ����� ���� �ּ� ���� ���ϰ� �迭�� ������ �������ش�.

		// �� [4,3,2,1] �ѱ��̴� 4
		// �� [10] �ѱ��̴� 1

		if (arr.length <= 1) { // ������ ����� ����
			int[] answer = { -1 };
			return answer;
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]); // �ּҰ��� ���� �� ����. (min, 1)
		}

		int[] answer = new int[arr.length - 1];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue; // �ش� �ݺ������� Ż���ϰ� ������ �ݺ��� �̾ �Ѵ�.
			}
			answer[index++] = arr[i]; // ���ο� �迭�� ���� �����ϰ� ����

		}
		return answer;
	}
}
