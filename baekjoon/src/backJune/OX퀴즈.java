package backJune;

import java.util.Scanner;
public class OXÄûÁî {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str[] = new String[num];
		
		for(int i = 0; i < num; i++) {
			int sum = 0;
			int total = 0;
			str[i] = sc.next();
			for(int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == 'O') {
					total += ++sum;
				}else if(str[i].charAt(j) == 'X') {
					sum = 0;
				}
			}
			System.out.println(total);
		}
	}
}
