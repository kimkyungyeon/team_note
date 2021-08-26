package team_note.class1;

import java.util.Arrays;
import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		//알파벳 총길이 26
		int[] intArr = new int[26];
		
		
		for (int i=0;i<word.length();i++) {
			//A-Z 65-90
			if(65<=word.charAt(i) && word.charAt(i)<=90) {
				intArr[word.charAt(i)-65]++;
			} else {
			//그외 소문자 97-122
				intArr[word.charAt(i)-97]++;
			}
		}
		
		int most=-1;
		char ch = '?';
		for(int i=0; i<intArr.length;i++) {
			
			if(most<intArr[i]) {
				most=intArr[i];
				ch = (char) (i+65);
			} else if(most==intArr[i]) {
				ch = '?';
			}
			
		}
		System.out.println(Arrays.toString(intArr));
		System.out.println(ch);
	}
}
