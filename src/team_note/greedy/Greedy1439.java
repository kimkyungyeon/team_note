package team_note.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy1439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char temp= str.charAt(0);
		int otoz = 0;
		int ztoo = 0;
		if(temp == '1') {
			ztoo++;
		}else {
			otoz++;
		}
		
		for(int i=1; i<str.length(); i++) {
			if(temp != str.charAt(i)) {
				if(temp == '1') {
					otoz++;
				} else {
					ztoo++;
				}
				temp = str.charAt(i);
			}
		}
		
		if(ztoo >otoz) {
			System.out.println(otoz);
		} else {
			System.out.println(ztoo);
		}
		// 변화의 갯수만 세면 됨
//		Scanner sc = new Scanner(System.in);
//
//		String s = sc.next();
//		char[] arr = s.toCharArray();
//		int zero = 0, one = 0;
//
//		int cnt = 0;
//		char tmp = arr[0];
//		if (arr[0] == '0') {
//			zero++;
//		} else {
//			// if(arr[0] == '1') {
//			one++;
//		}
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i - 1] != arr[i]) {
//				if (arr[i] == '0') {
//					zero++;
//				}
//
//				if (arr[i] == '1') {
//					one++;
//				}
//			}
//
//		}
//		System.out.println(zero);
//		System.out.println(one);
//
//		System.out.println(Math.min(zero, one));
	}
}
