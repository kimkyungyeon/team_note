package team_note.class1;

import java.util.Scanner;

public class Baek2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int res = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		int[] numArr = new int[10];
		String str = Integer.toString(res);
		
		for(int i = 0; i<str.length();i++) {
			numArr[str.charAt(i)-48]++;
		}
		for(int i=0;i<numArr.length;i++) {
			System.out.println(numArr[i]);
		}
		
	}
}
