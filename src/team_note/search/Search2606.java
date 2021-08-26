package team_note.search;

import java.util.Scanner;

public class Search2606 {
	public static boolean[] visited;
	public static int[][] graph;
	public static int m,n;
	//감염된 컴퓨터 수
	public static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터 수
		m = sc.nextInt();
		//간선 수
		n = sc.nextInt();
		
		visited = new boolean[m+1];
		graph = new int[m+1][m+1];
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			graph[x][y]=1;
			graph[y][x]=1;
		}
		
		System.out.println(dfs(1));
		
		
		
	}
	
	private static int dfs(int start) {
		visited[start] = true;
		
		for(int i=1; i<=m; i++) {
			if(graph[start][i] == 1 && visited[i] == false) {
				count++;
				dfs(i);
			}
		}
		return count;
		
	}
}
