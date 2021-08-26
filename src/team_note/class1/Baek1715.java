package team_note.class1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Baek1715 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		
		for(int i=0;i<a;i++) {
			pq.add(sc.nextInt());
		}
		
		int sum=0;
		if(a==1) {
			System.out.println(0);
		}else {
			while(true) {
				int num1= pq.poll();
				int num2= pq.poll();
				sum+=num1+num2;
				if(pq.isEmpty()) {
					break;
				}
				pq.offer(num1+num2);
			}
			System.out.println(sum);
		}
		
		
		
	}
}
