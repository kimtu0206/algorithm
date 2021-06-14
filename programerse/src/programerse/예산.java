package programerse;

import java.util.Arrays;

public class ¿¹»ê {

	public int solution(int[] d, int budget) {
		int count = 0;
		int answer = 0;
		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			answer = answer + d[i];
			if (answer > budget) {
				break;
			}
			count++;
		}
		answer = count;
		return answer;
	}
}
