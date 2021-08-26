package team_note.greedy;

import java.util.Scanner;

public class Greedy5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int ret = 1000-a;
		int count = 0;
		
		int[] arr = {500,100,50,10,5,1};
		
		for(int i=0; i<6 ; i++) {
			count = count+ (ret/arr[i]);
			ret = ret%arr[i];
		}
		
		System.out.println(count);
	}
}
 