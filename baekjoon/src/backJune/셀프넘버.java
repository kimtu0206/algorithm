package backJune;

public class �����ѹ� {
	public static void main(String args[]) {
		int limit = 10000; // ���� 10000�̶�� ����
		boolean[] temp = new boolean[limit]; // boolean �迭�� 10000���� ����

		// boolean �迭�� 10000���� ���� ���� ���ܽ����� ���� true�� ��ȯ-> false���鸸 ��ȯ

		for (int i = 1; i < limit; i++) { // ���� ������ ��
			if (selfNumber(i) <= limit) {
				temp[selfNumber(i) - 1] = true;

			}
		}
		for (int j = 0; j < 10000; j++) { // ���� ��ų ��
			if (!temp[j]) { //
				System.out.println(j + 1);
			}
		}
	}

	// n�� �� �ڸ����� ���ϴ� �Ǻ�
	public static int selfNumber(int n) {
		int total = n;
		while (n != 0) {

			total += n % 10;
			n /= 10;

		}
		return total;

	}
}
