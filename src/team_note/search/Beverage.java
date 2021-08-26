package team_note.search;

import java.util.Scanner;

public class Beverage {
	public static int[][] graph = new int[1000][1000];
	public static int m;
	public static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			for (int j=0;j<m;j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		int res = 0;
		
		for( int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(dfs(i,j)) {
					res+=1;
				}
			}
		}
		System.out.println(res);
	}

	private static boolean dfs(int i, int j) {
		if(i<=-1 || i>=n || j<=-1 || j>=m) {
			return false;
		}
		
		if(graph[i][j] == 0) {
			
			graph[i][j] =1;
			
			dfs(i-1,j);
			dfs(i+1,j);
			dfs(i,j-1);
			dfs(i,j+1);
			return true;
		}
		return false;
	}
}
