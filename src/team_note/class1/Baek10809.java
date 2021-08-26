package team_note.class1;

import java.util.Scanner;

public class Baek10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] intArr = new int[26];
		for(int i=0; i<26; i++) {
			intArr[i]=-1;
		}
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(intArr[ch-'a']==-1) {
				intArr[ch-'a']=i;
			}
		}
		
		for(int val : intArr) {
			System.out.print(val+ " ");
		}
	}
}
