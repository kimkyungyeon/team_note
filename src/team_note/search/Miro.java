package team_note.search;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node {
	private int x;
	private int y;
	
	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
public class Miro {
	public static int n;
	public static int m;
	public static int[][] graph = new int[200][200];
	
	//이동할 방향 상하좌우
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(bfs(0,0));
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
	}

	private static int bfs(int x, int y) {
		//
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			x=node.getX();
			y=node.getY();
			
			for(int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				
				
				
				//배열범위 벗어나면 x
				if(nx<0 || nx>=n || ny<0 || ny >=m) continue;
				//벽이면 x
				if(graph[nx][ny] == 0) continue;
				
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y]+1;
					q.offer(new Node(nx, ny));
				}
			}
		}
		return graph[n-1][m-1];
	}
}
