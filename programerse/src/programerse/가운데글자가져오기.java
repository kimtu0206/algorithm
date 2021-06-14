package programerse;

public class 가운데글자가져오기 {

	class Solution {
	    public String solution(String s) {
	       
	    	String answer = ""; //String answer를 선언 

	       //짝수와 홀수인 경우로 나누어서 정리 짝수면 2글자가 나오고 홀수면 1글자가 나올 것이다.
	    	if(s.length()%2==0) { //짝수이면 가운데 두글자를 반환
	    		//서브스트링 쓴이유 짝수인 경우 2개가 나와야되기 때문에
	    		answer = s.substring(s.length()/2-1, s.length()/2+1); //5 , 3
	    	}else {
	    		answer =  s.substring(s.length()/2, s.length()/2+1); //2, 3
	    	}
	    	return answer;
	    }
	}
}
