package team_note.class1;

import java.util.Scanner;

public class Baek2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[8];
		
		for(int i=0; i<8; i++) {
			intArr[i] = sc.nextInt();
		}
		
		String output = "";
		for(int i=0; i<7; i++) {
			
			if(intArr[i]==intArr[i+1]-1) {
				output = "ascending";
			} else if(intArr[i]==intArr[i+1]+1) {
				output = "descending";
			} else {
				output = "mixed";
				break;
			}
		}
		System.out.println(output);
		
	}
}
