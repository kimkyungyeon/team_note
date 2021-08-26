package team_note.greedy;

import java.util.Scanner;

// 숫잦를 입력받아서 *, +를 이용하여 가장큰수를 만드시오!
public class GreedyXplus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 첫번째 문자를 숫자로 변경한 대입
		long result = str.charAt(0)-'0';
		for(int i=1; i<str.length(); i++) {
			int num = str.charAt(i)-'0';
			if(num<=1 || result<=1) {
				result+=num;
			}else {
				result*=num;
			}
			
		}
		System.out.println(result);
	}
}
