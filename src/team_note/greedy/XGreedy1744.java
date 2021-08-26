package team_note.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class XGreedy1744 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Integer[] arr = new Integer[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}
}
