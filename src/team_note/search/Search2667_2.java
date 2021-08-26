package team_note.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Search2667_2 {
	public static int m;
	public static int count;
	public static int[][] map;
	public static int[] dx = {-1,1,0,0};
	public static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		sc.nextLine();
		
		map = new int[m][m];
		
		for(int i=0;i<m;i++) {
			String str = sc.nextLine();
			for(int j=0;j<m;j++) {
				map[i][j] = str.charAt(j)-'0';
			}
		}
		
		//총단지의 수
		int total = 0;
		//단지내 세대수 저장하는 ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]==1) {
					count = 0;
					total++;
					dfs(i,j);
					arr.add(count);
				}
				
			}
		}
		Collections.sort(arr);
		System.out.println(total);
		for(int c: arr) {
			System.out.println(c);
		}
	}

	private static void dfs(int x, int y) {
		map[x][y] = 0;
		count++;
		
		for(int i=0;i<4;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(0 <= nx && nx < m && 0 <= ny && ny < m) {
				if(map[nx][ny]==1) {
					dfs(nx,ny);
				}
			}
		}
	}
}
