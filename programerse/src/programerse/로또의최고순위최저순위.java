package programerse;

public class �ζ����ְ������������ {
	public int[] solution(int[] lottos, int[] win_nums) {
        //1.
		int cnt = 0; //��÷��ȣ�� ���� ��ġ�ϴ� ������ ���� cnt
		int zeroCnt = 0; //������ ����..zeroCnt
		for(int lotto : lottos) {
			//2. lotto�� 0�̸� zeroCnt�� ���� 1�� ������Ŵ 
			if(lotto == 0) {
				zeroCnt ++;
				continue;
			}
			for(int win_num : win_nums) {
				//3. lotto�� 0�� �ƴϸ� ��÷��ȣ�� �ο��� ��ȣ�� ���� ��ġ�ϸ�
				//cnt�� 1���� 
				if(win_num == lotto) {
					cnt++;
					break;
				}
			}
		}
		//4. �ְ������ Math.max(cnt+zeroCnt,1)�� ����� �μ��� ���� ��ȣ���� ������ ���� �������� �ʾ��� ��
		//��÷ ��ȣ�� ���� ��� ��ȣ�� ��ġ���� ���� ��� cnt+zeroCnt�� 0�� �ǹǷ� Math.max�� ���� 0�϶��� ������ 1�� �ǰ� ����
		
		//���������� Math.max(cnt, 1)�� ���� ���� ��ȣ�� cnt�� 0�� ��� �� ������ 1�� �ǰ� ����
		// cnt�� ���� �� �ִ� 0~6�������� ����� ������ ����� ���ϱ� ���� ������ ���ڸ� 7���� ����
		return new int[] {7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt, 1)};
    }

}
