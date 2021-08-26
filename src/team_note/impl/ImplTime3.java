package team_note.impl;

import java.util.Scanner;

public class ImplTime3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//시간입력 받기
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<=n;i++) {
			for(int j=0; j<60; j++) {
				for(int k=0; k<60; k++) {
					if (check(i,j,k)){
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
		
	}

	private static boolean check(int h, int m, int s) {
		if(h%10==3 || h/10==3 || m%10==3 || m/10==3 || s%10==3 || s/10==3) {
			return true;
		}
		return false;
	}
}
