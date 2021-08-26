package team_note.greedy;

import java.util.Scanner;

public class Greedy4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(true) {
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			int res = 0;
			if(v>p) {
				res = res+(v/p*l);
				if(v%p>=l) {
					res = res+l;
				} else {
					res = res+(v%p);
				}
				
			}
			
			if(l==0) break;
			System.out.println("Case "+i+": "+res);
			i++;
		}
		
	}
}
