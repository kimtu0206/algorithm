package backJune;

import java.util.Scanner;

public class �������� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String a = scan.next();
		scan.close();

		int sum = 0;

		for (int i = 0; i < N; ++i) { //���� �����ش�.
			sum += a.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
