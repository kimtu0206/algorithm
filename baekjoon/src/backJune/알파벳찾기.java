package backJune;

import java.util.Scanner;

public class ���ĺ�ã�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String temp = sc.next();

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(temp.indexOf(i) + " ");
			// Ư�� ���ڳ� ���ڿ��� �տ������� ó�� �߰ߵǴ� �ε����� ��ȯ�ϸ� ���� ã�� ������ ��� "-1"�� ��ȯ�մϴ�.
		}
	}
}
