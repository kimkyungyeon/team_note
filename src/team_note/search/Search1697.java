package team_note.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Search1697 {
	
	public static int[] visited = new int[100001];
	public static int N,K;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		
		if(N == K) {
			System.out.println(0);
			return;
		}
		bfs(N,K,visited);
		System.out.println(visited[K]);
		
	}

	private static void bfs(int a, int b, int[] c) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(a);
		c[a] = 0;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			if(c[b] != 0) {
				break;
			}
			if(temp-1 >= 0 && c[temp-1]==0){
				c[temp-1] = c[temp] +1;
				q.offer(temp-1);
			}
			if(temp+1 <= 100000 && c[temp+1] == 0) {
				c[temp+1] = c[temp] +1;
				q.offer(temp+1);
			}
			if(temp*2 <= 100000 && c[2*temp] == 0) {
				c[2*temp] = c[temp] +1;
				q.offer(temp*2);
			}
		}
		
	}
}
