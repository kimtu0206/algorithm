package programerse;

public class 로또의최고순위최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
        //1.
		int cnt = 0; //당첨번호와 비교해 일치하는 개수를 담을 cnt
		int zeroCnt = 0; //동생의 낙서..zeroCnt
		for(int lotto : lottos) {
			//2. lotto가 0이면 zeroCnt의 값을 1씩 증가시킴 
			if(lotto == 0) {
				zeroCnt ++;
				continue;
			}
			for(int win_num : win_nums) {
				//3. lotto가 0이 아니면 당첨번호와 민우의 번호를 비교해 일치하면
				//cnt에 1증가 
				if(win_num == lotto) {
					cnt++;
					break;
				}
			}
		}
		//4. 최고순위는 Math.max(cnt+zeroCnt,1)를 사용해 민수가 찍은 번호들이 낙서에 의해 가려지지 않았을 때
		//당첨 번호와 비교해 모든 번호가 일치하지 않을 경우 cnt+zeroCnt는 0이 되므로 Math.max를 통해 0일때엔 무조건 1이 되게 설정
		
		//최저순위는 Math.max(cnt, 1)를 통해 비교한 번호의 cnt가 0일 경우 또 무조건 1이 되게 설정
		// cnt가 가질 수 있는 0~6개까지의 경우의 수에서 등수를 구하기 위해 설정한 숫자를 7에서 빼줌
		return new int[] {7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt, 1)};
    }

}
