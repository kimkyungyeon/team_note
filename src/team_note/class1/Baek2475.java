package team_note.class1;

import java.util.Scanner;

public class Baek2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr= new int[5];
		
		for(int i=0;i<5;i++) {
			intArr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<5;i++) {
			sum += intArr[i]*intArr[i];
		}
		
		System.out.println(sum%10);
	}
}
