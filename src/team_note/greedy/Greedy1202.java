package team_note.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Jewelry {
	int mass;
	int value;
	
	public Jewelry(int mass, int value) {
		super();
		this.mass = mass;
		this.value = value;
	}
	
}

public class Greedy1202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Jewelry[] js = new Jewelry[n];
		
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int v = sc.nextInt();
			
			js[i] = new Jewelry(m, v);
		}
		
		Arrays.sort(js, new Comparator<Jewelry>() {

			@Override
			public int compare(Jewelry o1, Jewelry o2) {
				if(o1.mass == o2.mass) {
					return o2.value - o1.value; //o2가격이 더클 때 값은 양수가 나오기때문에 참으로 판단하여 위치 변경
				}
				return o1.mass-o2.mass;
			}
		});
		
		int[] bags = new int[k];
		
		for(int i=0; i<bags.length; i++) {
			bags[i] = sc.nextInt();
		}
		Arrays.sort(bags);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		long res =0;
		
		for(int i=0,j=0;i<k;i++) {
			
			while(j<n && js[j].mass <= bags[i]) {
				pq.offer(js[j++].value);
			}
			
			
			if(!pq.isEmpty()) {
				res += pq.poll();
			}
		}
		System.out.println(res);
		
	}
}
