package team_note.class1;

import java.util.Scanner;

public class Baek2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		} else if(h<1 && m<45) {
			System.out.println("23 "+(60+m-45));
		} else if(h>=1 && m<45) {
			System.out.println((h-1) + " "+(60+m-45));
		}
	}
}
