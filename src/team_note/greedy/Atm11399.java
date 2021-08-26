package team_note.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Atm11399 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int prev = 0;
		int sum = 0;
		
		for (int i=0; i<a; i++) {
			sum += prev +arr[i];
			
			prev += arr[i];
		}
		
		System.out.println(sum);
	}
}
