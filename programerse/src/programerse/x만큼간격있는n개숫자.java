package programerse;

public class x��ŭ�����ִ�n������ {
	
	  public long[] solution(int x, int n) {
	        long[] answer = new long[n]; //[2,4,6,8,10]
	        long temp = x; //2���� ������ 2�� �����ϴ�..
	        
	        for(int i = 0; i<n; i++) {
	        	answer[i] = temp * (i+1);
		    //[2,4,6,8,10] = 2 * 0+1 = 2
	        //[2,4,6,8,10] = 2 * 1+1 = 4
	        //[2,4,6,8,10] = 2 * 2+1 = 6
	        //[2,4,6,8,10] = 2 * 3+1 = 8
	        //[2,4,6,8,10] = 2 * 4+1 = 10

	        }
	        return answer;
	    }
}
