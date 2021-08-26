//package team_note.search;
//
//import java.util.Scanner;
//
//public class Search2667 {
//	public static int m;
//	public static int[][] graph = new int[25][25];
//	public static int count;
//	public static int[] dx = {-1,1,0,0};
//	public static int[] dy = {0,0,-1,1};
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		m = sc.nextInt();
//		sc.nextLine();
//		
//		for(int i=0;i<m;i++) {
//			String str = sc.nextLine();
//			for(int j=0;j<m;j++) {
//				graph[i][j] = str.charAt(j)-'0';
//			}
//		}
//		int total =0;
//		count = 0;
//		
//		for (int i=0;i<m;i++) {
//			for (int j=0;j<m;j++) {
//				if(graph[i][j]==1) ++count;
//				total++;
//				dfs(i,j,count);
//			}
//		}
//		
//		for (int i=0;i<m;i++) {
//			for (int j=0;j<m;j++) {
//				System.out.print(graph[i][j]);
//			}
//			System.out.println();
//		}
//	}
//
//	private static void dfs(int x, int y, int count) {
//		if(x<0 || x>=m || y<0 || y>=m) return ;
//		graph[x][y]=0;
//		
//		for(int i=0;i<4;i++) {
//			int nx= x+dx[i];
//			int ny= y+dx[i];
//			
//			if(nx>=0 || ny>=0 || nx<m || ny<m) {
//				if(graph[nx][ny]==1 ) {
//					dfs(nx,ny,count);
//				}
//			}
//		}
//	}
//}
