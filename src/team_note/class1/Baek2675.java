package team_note.class1;

import java.util.Scanner;

public class Baek2675 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		
		for (int i=0; i<count; i++) {
			int a = sc.nextInt();
			String str= sc.next();
			
			for (int j=0; j<str.length(); j++) {
				for(int k=0; k<a; k++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
		
		
	}
}
