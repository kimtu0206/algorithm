package backJune;

public class 셀프넘버 {
	public static void main(String args[]) {
		int limit = 10000; // 값을 10000이라고 지정
		boolean[] temp = new boolean[limit]; // boolean 배열을 10000까지 만듬

		// boolean 배열을 10000까지 만든 이후 제외시켜줄 값을 true로 변환-> false값들만 반환

		for (int i = 1; i < limit; i++) { // 제외 시켜줄 값
			if (selfNumber(i) <= limit) {
				temp[selfNumber(i) - 1] = true;

			}
		}
		for (int j = 0; j < 10000; j++) { // 포함 시킬 값
			if (!temp[j]) { //
				System.out.println(j + 1);
			}
		}
	}

	// n과 각 자릿수를 더하는 판별
	public static int selfNumber(int n) {
		int total = n;
		while (n != 0) {

			total += n % 10;
			n /= 10;

		}
		return total;

	}
}
