package team_note.greedy;

import java.util.Scanner;

public class CoinGreedy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n,k 를 공백을 기준으로 구분하여 입력받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) {
			if (n%k==0) {
				result += 1; 
				n = n/k;
			} else {
				if (n<2) break;
				result += 1;
				n=n-1;
			}
		}
		
		System.out.println(result);
	}
}
