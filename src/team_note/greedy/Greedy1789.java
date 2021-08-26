package team_note.greedy;

import java.util.Scanner;

public class Greedy1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
		long res = 0;
		int i=1;
		while(true) {
			res+=i;
			if(a<res) {
				i = i-1;
				break;
			}
			i++;
		}
		System.out.println(i);
	}

}
