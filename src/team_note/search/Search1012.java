package team_note.search;

import java.util.Scanner;

public class Search1012 {

	public static int T;
	public static int N, M;
	public static int K;
	public static int[][] map;
	public static boolean[][] visit;
	public static int cnt;
	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();

			cnt = 0;

			map = new int[N][M];
			visit = new boolean[N][M];

			for (int j = 0; j < K; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				sc.nextLine();

				map[b][a] = 1;
			}

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {

					if (bfs(j, k)) {
						cnt++;
					}
					
				}
			}
			System.out.println(cnt);
		}
	}

	private static boolean bfs(int n, int m) {
		if(n<=-1 || n>=N || m<= -1 || m>=M) {
			return false;
		}
		
		if(map[n][m] == 1 && !visit[n][m] ) {
			
			visit[n][m] = true;
			
			bfs(n-1,m);
			bfs(n+1,m);
			bfs(n,m-1);
			bfs(n,m+1);
			
			return true;
		}

		return false;
	}
}
