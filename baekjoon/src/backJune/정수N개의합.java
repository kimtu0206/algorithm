package backJune;

public class 정수N개의합 {

	public static long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		System.out.println(ans);
		return ans;
	}


}