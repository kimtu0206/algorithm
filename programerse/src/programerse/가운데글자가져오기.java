package programerse;

public class ������ڰ������� {

	class Solution {
	    public String solution(String s) {
	       
	    	String answer = ""; //String answer�� ���� 

	       //¦���� Ȧ���� ���� ����� ���� ¦���� 2���ڰ� ������ Ȧ���� 1���ڰ� ���� ���̴�.
	    	if(s.length()%2==0) { //¦���̸� ��� �α��ڸ� ��ȯ
	    		//���꽺Ʈ�� ������ ¦���� ��� 2���� ���;ߵǱ� ������
	    		answer = s.substring(s.length()/2-1, s.length()/2+1); //5 , 3
	    	}else {
	    		answer =  s.substring(s.length()/2, s.length()/2+1); //2, 3
	    	}
	    	return answer;
	    }
	}
}
