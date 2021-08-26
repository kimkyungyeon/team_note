package team_note.class1;

import java.util.Scanner;

public class Baek2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[9];
		
		int max = -1;
		int number=-1;
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = sc.nextInt();
		}
		
		for(int i=0;i<intArr.length;i++) {
			if(intArr[i]>max) {
				max=intArr[i];
				number=i+1;
			}
		}
		System.out.println(max);
		System.out.println(number);
	}
}
