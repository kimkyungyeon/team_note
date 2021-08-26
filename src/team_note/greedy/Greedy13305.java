package team_note.greedy;

import java.util.Scanner;

public class Greedy13305 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		long[] dis = new long[count-1];
		long[] price = new long[count];
		
		for(int i=0; i<dis.length; i++) {
			dis[i] = sc.nextInt();
		}
		
		for(int i=0; i<price.length; i++) {
			price[i] = sc.nextInt();
		}

		long total= 0;
		long oil=price[0];
		
		for(int i=0; i<dis.length; i++) {
			if (price[i] < oil) {
				oil=price[i];
			}
			total += oil*dis[i];
		}
		
		System.out.println(total);
	
	}
}
