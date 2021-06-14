package programerse;

public class 제일작은수제거 {

	public int[] solution(int[] arr) {
		// 리턴하는 배열이 빈 배열일 경우 -1를 리턴,
		// 길이가 1이하일때 빈 배열
		// 조건을 사용해 값을 리턴, 아닐경우 반복문을 통해 최소 값을 구하고 배열에 저장해 리턴해준다.

		// 예 [4,3,2,1] 총길이는 4
		// 예 [10] 총길이는 1

		if (arr.length <= 1) { // 조건을 사용해 리턴
			int[] answer = { -1 };
			return answer;
		}

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]); // 최소갑을 구할 수 있음. (min, 1)
		}

		int[] answer = new int[arr.length - 1];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				continue; // 해당 반복구간만 탈출하고 다음번 반복을 이어서 한다.
			}
			answer[index++] = arr[i]; // 새로운 배열에 값을 저장하고 리턴

		}
		return answer;
	}
}
