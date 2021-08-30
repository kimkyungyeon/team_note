package team_note.search;

import java.util.Scanner;

public class Search2468 {
	public static int N;
	public static int cnt;
	public static int res;
	public static int[] dx = {-1, 1, 0, 0};
	public static int[] dy = {0, 0, -1, 1};
	public static int[][] map;
	public static boolean[][] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int max = 0;
		map = new int[N][N];
		visit = new boolean[N][N];
		cnt = 0;
		res = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]> max) {
					max = map[i][j];
				}
			}
		}
		
		
		for(int k=0; k<max; k++) {
			cnt = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j] <= k) {
						visit[i][j]= true;
					} else {
						visit[i][j]= false;
					}
				}
			}
			
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(visit[i][j] == false) {
						dfs(i, j);
						cnt++;
						
					}
				}
			}
			if(res<cnt) {
				res= cnt;
			}
		}
		System.out.println(res);
		
	}

	private static void dfs(int n, int m) {
		
				visit[n][m] = true;	
			
				
				for(int i=0; i<4; i++) {
					int nx = n +dx[i];
					int ny = m +dy[i];
					
					if(nx>=0 && ny>=0 && nx<N && ny<N) {
						if(visit[nx][ny] == false) {
							dfs(nx,ny);
						}
					}
				}
				
	}
}
