package team_note.search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Search7576 {
	public static int n,m;
	public static int[][] map;
	public static int count;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		count = 0;
		
		map = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				map[i][j]= sc.nextInt();
			}
		}
		
		bfs(map, m, n);
	}

	private static void bfs(int[][] map, int m, int n) {
		//익은 토마토 = 1
		//익은 토마토들의 좌표를 모두 queue 에 넣는다.
		Queue<Dot> q = new LinkedList<Dot>();
		for(int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if(map[i][j] == 1)
					q.add(new Dot(i,j));
			}
		}
		
		
		//큐가 빌때까지 실행
		//큐의 값을 하나 가져와서
		//상하좌우 반복문을 통해 이전좌표의 값보다 +1 을 한다.
		while (!q.isEmpty()) {
			Dot dot = q.poll();
			for(int i=0;i<4;i++) {
				int nextX = dot.x + dx[i];
				int nextY = dot.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) {
					continue;
				}
				
				if(map[nextX][nextY] != 0) {
					continue;
				}
				
				map[nextX][nextY] = map[dot.x][dot.y] + 1;
				q.add(new Dot(nextX,nextY));
			}
		}
		
		int max = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				max = Math.max(max, map[i][j]);
			}
		}
		System.out.println(max-1);
	}


}
class Dot {
	int x ;
	int y ;
	
	public Dot(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
