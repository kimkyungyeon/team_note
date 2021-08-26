package team_note.search;

import java.util.Scanner;

public class Search4963 {
	public static int w;
	public static int h;
	public static int cnt;
	public static int[][] map;
	public static boolean[][] visit;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			cnt = 0;	
			w = sc.nextInt();
			h = sc.nextInt();
			if(w==0 && h==0) {
				break;
			}
			
			map= new int[h][w];
			visit = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(dfs(i,j)) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
	
	private static boolean dfs(int i, int j) {
		
		if(i<0 || j<0 || i>=h || j>=w) {
			return false;
		}
		
		if(map[i][j] ==1 && !visit[i][j]) {
			visit[i][j] = true;
			
			dfs(i-1,j);
			dfs(i-1,j-1);
			dfs(i+1,j);
			dfs(i+1,j-1);
			dfs(i,j-1);
			dfs(i,j+1);
			dfs(i-1,j+1);
			dfs(i+1,j+1);
			
			return true;
		}
		return false;
		
	}
}
