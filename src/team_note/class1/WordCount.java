package team_note.class1;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine().trim();
		String[] strArr = a.split(" ");
		if(a.isEmpty()) {
			System.out.println(0);
		}else {
		System.out.println(strArr.length);
		}
		
	}
}
